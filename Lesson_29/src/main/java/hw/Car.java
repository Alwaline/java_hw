package hw;

public class Car {
    private String number;
    private String model;
    private String color;
    private Integer odometer;
    private Integer cost;

    public Car(String number, String model, String color, Integer odometer, Integer cost) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.odometer = odometer;
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car [number=" + number + ", model=" + model + ", color=" + color + ", odometer=" + odometer + ", cost="
                + cost + "]";
    }

    
}
