package com.example.sod14.randompick.Logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sod14 on 30/01/2018.
 */

public class ElementList<String> implements Serializable {
    private List<String> elements;
    private String description;
    private String name;
    private int color;

    public ElementList() {
        elements = new ArrayList<>();
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
