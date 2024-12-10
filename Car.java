package classes;



public class Car {
    private String type;
    private String color;
    private double kilometers;

    // פעולה בונה
    public Car(String type, String color, double kilometers) {
        this.type = type;
        this.color = color;
        this.kilometers = kilometers;
    }

    // פעולות get
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public double getKilometers() {
        return kilometers;
    }

    // פעולה set עבור מס' הק"מ
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    // פעולה לתיאור העצם
    public String toString() {
        return "Car [Type=" + type + ", Color=" + color + ", Kilometers=" + kilometers + "]";
    }
}

