package ru.itis.simple.example02;

public abstract class Button {

    private int x;
    private int y;

    private String label;

    public Button(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public abstract void onClick();

    public void click() {
        onClick();
    }
}
