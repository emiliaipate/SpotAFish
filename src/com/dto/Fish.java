package com.dto;

/**
 * Created by IntelliJ IDEA.
 * User: ipateemi
 * Date: 19-5-12
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */
public class Fish {
    int id;
    String name;
    String description;
    String color;

    public Fish(int id, String name, String description, String color) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
    }


    public Fish(int id, String name, String description) {
        new Fish(id, name, description, null);
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
