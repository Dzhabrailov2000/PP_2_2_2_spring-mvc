package web.model;

public class Car {
    private String model;
    private int doors;
    private int speed;

    public Car() {
    }

    public Car(String model, int doors, int speed) {
        this.model = model;
        this.doors = doors;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", doors=" + doors +
                ", speed=" + speed +
                '}';
    }
}
