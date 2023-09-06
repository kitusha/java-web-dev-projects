package org.launchcode;

public class MenuItem {
    // Fields: price, description, category, and new status
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    // Constructor
    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true; // Menu items are new by default
    }

    // Getter and setter for new status
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Equals method to determine if two menu items are equal
    public boolean equals(MenuItem other) {
        // Compare fields for equality
        return this.price == other.price &&
                this.description.equals(other.description) &&
                this.category.equals(other.category);
    }

    // ToString method to print a menu item
    public String toString() {
        return "Category: " + category + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n" +
                "New: " + isNew;
    }
}
