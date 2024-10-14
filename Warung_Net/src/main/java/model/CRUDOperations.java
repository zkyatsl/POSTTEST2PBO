/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
import java.util.List;

public interface CRUDOperations<T> {
    void create(T obj);
    T read(String identifier);
    void update(String identifier, T newObj);
    void delete(String identifier);
    List<T> list();
}
