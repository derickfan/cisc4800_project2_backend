package dev.derickfan.project2.model;

public class Item {

    // Instance Variables
    private int id;
    private String name;
    private Category category;
    private ItemImage imageURL;

    // Constructor
    public Item(int id, String name, Category category, ItemImage imageURL) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.imageURL = imageURL;
    }

    // Default Constructor
    public Item() {}

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ItemImage getImageUrl() {
        return imageURL;
    }

    public void setImageURL(ItemImage imageURL) {
        this.imageURL = imageURL;
    }

}
