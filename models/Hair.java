package com.frostylog.spring.lib.models;

public class Hair {
    private String style;
    private String color;
    private String length;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Hair(String color, String length) {
        this.color = color;
        this.length = length;
    }
}