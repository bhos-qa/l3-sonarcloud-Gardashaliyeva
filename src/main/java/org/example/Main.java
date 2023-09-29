package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PermissionManager
        PermissionManager manager = new PermissionManager();

        // Display the current permission level
        System.out.println("Current Permission Level: " + manager.getCurrentPermissionLevel());

        // Set a new permission level (e.g., ADMIN)
        manager.setPermissionLevel(PermissionLevel.ADMIN);

        // Display the current role name
        System.out.println("Current Role Name: " + manager.getCurrentRoleName());
    }
}