/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;

public final class ComputerManager implements CRUDOperations<Computer> {
    private List<Computer> computers = new ArrayList<>();

    @Override
    public void create(Computer computer) {
        computers.add(computer);
    }

    @Override
    public Computer read(String id) {
        return computers.stream()
                .filter(comp -> comp.getId() == Integer.parseInt(id))
                .findFirst().orElse(null);
    }

    @Override
    public void update(String id, Computer updatedComputer) {
        Computer comp = read(id);
        if (comp != null) {
            comp.setStatus(updatedComputer.getStatus());
        }
    }

    @Override
    public void delete(String id) {
        computers.removeIf(comp -> comp.getId() == Integer.parseInt(id));
    }

    @Override
    public List<Computer> list() {
        return computers;
    }
}
