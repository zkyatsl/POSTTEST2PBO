/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warung_net;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        ComputerManager computerManager = new ComputerManager();
        UserManager userManager = new UserManager();

        
        computerManager.create(new Computer(1, "Online", 4000));
        computerManager.create(new Computer(2, "Offline", 0));
        userManager.create(new RegularUser("Jaksal", 20000));
        userManager.create(new VIPUser("fufufafa", 10000));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Welcome, Admin Warnet SKYNET ===");
            System.out.println("1. Lihat Status Komputer");
            System.out.println("2. Lihat Status Pengguna");
            System.out.println("3. Admin - Kelola Komputer");
            System.out.println("4. Admin - Kelola Pengguna");
            System.out.println("5. Keluar");
            System.out.print("Mau ngapain?: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    displayComputers(computerManager);
                    break;
                case 2:
                    displayUsers(userManager);
                    break;
                case 3:
                    manageComputers(computerManager, scanner);
                    break;
                case 4:
                    manageUsers(userManager, scanner);
                    break;
                case 5:
                    System.out.println("Ntar balik lagi yak!.");
                    exit = true;
                    break;
                default:
                    System.out.println("Opsi yang kamu pilih ga valid.");
                    break;
            }
        }
        scanner.close();
    }

    public static void displayComputers(ComputerManager computerManager) {
        System.out.printf("%-10s %-10s %-10s\n", "ID", "Status", "Tarif");
        for (Computer comp : computerManager.list()) {
            System.out.printf("%-10d %-10s %-10d\n", comp.getId(), comp.getStatus(), comp.getRatePerHour());
        }
    }

    public static void displayUsers(UserManager userManager) {
        System.out.printf("%-10s %-10s %-10s\n", "Nama", "Saldo", "Tipe");
        for (User user : userManager.list()) {
            System.out.printf("%-10s %-10d %-10s\n", user.getName(), user.getBalance(), user.getUserType());
        }
    }

    public static void manageComputers(ComputerManager computerManager, Scanner scanner) {
        System.out.println("\n=== Admin - Kelola Komputer ===");
        System.out.println("1. Tambah Komputer");
        System.out.println("2. Ubah Komputer");
        System.out.println("3. Hapus Komputer");
        System.out.print("Pilih opsi: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                
                System.out.print("Masukkan ID komputer: ");
                int id = scanner.nextInt();
                System.out.print("Masukkan status (Online/Offline): ");
                String status = scanner.next();
                System.out.print("Masukkan tarif per jam: ");
                int rate = scanner.nextInt();
                computerManager.create(new Computer(id, status, rate));
                break;
            case 2:
                
                System.out.print("Masukkan ID komputer yang akan diubah: ");
                String updateId = scanner.nextLine();
                Computer comp = computerManager.read(updateId);
                if (comp != null) {
                    System.out.print("Masukkan status baru: ");
                    String newStatus = scanner.nextLine();
                    comp.setStatus(newStatus);
                    System.out.println("Status komputer berhasil diubah.");
                } else {
                    System.out.println("Komputer ga ada.");
                }
                break;
            case 3:
                
                System.out.print("Masukkan ID komputer yang mau dihapus: ");
                String deleteId = scanner.nextLine();
                computerManager.delete(deleteId);
                break;
            default:
                System.out.println("Opsi tidak valid.");
                break;
        }
    }

    public static void manageUsers(UserManager userManager, Scanner scanner) {
        System.out.println("\n=== Admin - Kelola Pengguna ===");
        System.out.println("1. Tambah Pengguna / Regis");
        System.out.println("2. Ubah billing Pengguna");
        System.out.println("3. Hapus Pengguna");
        System.out.print("Pilih opsi: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                
                System.out.print("Masukkan nama member: ");
                String name = scanner.nextLine();
                System.out.print("Masukkan billing awal: ");
                int balance = scanner.nextInt();
                System.out.print("Masukkan tipe member (Regular/VIP): ");
                String userType = scanner.next();
                if (userType.equalsIgnoreCase("VIP")) {
                    userManager.create(new VIPUser(name, balance));
                } else {
                    userManager.create(new RegularUser(name, balance));
                }
                break;
            case 2:
                
                System.out.print("Masukkan nama member: ");
                String userName = scanner.nextLine();
                User user = userManager.read(userName);
                if (user != null) {
                    System.out.print("Masukkan billing baru: ");
                    int newBalance = scanner.nextInt();
                    user.setBalance(newBalance);
                    System.out.println("billing member berhasil diubah.");
                } else {
                    System.out.println("Member tidak ditemukan.");
                }
                break;
            case 3:
                
                System.out.print("Masukkan nama member: ");
                String deleteUserName = scanner.nextLine();
                userManager.delete(deleteUserName);
                break;
            default:
                System.out.println("Opsi tidak valid.");
                break;
        }
    }
}