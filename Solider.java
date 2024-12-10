package classes;

public class Solider {
    private String name;
    private int height;

    // פעולה בונה
    public Solider(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // פעולות get
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    // פעולה לתיאור העצם
    public String toString() {
        return "Soldier [name=" + name + ", height=" + height + " cm]";
    }
}
