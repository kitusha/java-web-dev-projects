package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    // Constructor
    public Menu() {
        this.lastUpdated = new Date(); // Initialize with the current date
        this.items = new ArrayList<MenuItem>();
    }

    // Getter for last updated date
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // Method to add a menu item
    public void addMenuItem(MenuItem item) {
        items.add(item);
        lastUpdated = new Date(); // Update lastUpdated when a new item is added
    }

    // Method to remove a menu item
    public void removeMenuItem(MenuItem item) {
        items.remove(item);
        lastUpdated = new Date(); // Update lastUpdated when an item is removed
    }

    // Method to get all menu items
    public ArrayList<MenuItem> getMenuItems() {
        return items;
    }

    // Method to print the entire menu
    public void printMenu() {
        for (MenuItem item : items) {
            System.out.println(item.toString());
            System.out.println("---------------");
        }
    }
}
