/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class RegularUser extends User {
    public RegularUser(String name, int balance) {
        super(name, balance);
    }

    @Override
    public String getUserType() {
        return "Regular";
    }
}
