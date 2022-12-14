package web.model;

public class Car {

    int id;
    String model;
    int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", web.model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                "}\n";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car() {
    }

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public Car(int id, String model, int maxSpeed) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
