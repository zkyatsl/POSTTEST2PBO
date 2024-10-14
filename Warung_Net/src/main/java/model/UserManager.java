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

public class UserManager implements CRUDOperations<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public User read(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst().orElse(null);
    }

    @Override
    public void update(String name, User updatedUser) {
        User user = read(name);
        if (user != null) {
            user.setBalance(updatedUser.getBalance());
        }
    }

    @Override
    public void delete(String name) {
        users.removeIf(user -> user.getName().equals(name));
    }

    @Override
    public List<User> list() {
        return users;
    }
}