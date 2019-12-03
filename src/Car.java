public class Car {

    //    state components / fields (in contrast to parameters below in parentheses that are passed into variable)
    private String brand;
    private String model;
    private int speed;
    private int amount;

    //    constructor
    public Car(String brand, String model, int speed) {
//        "this" refers to the field in the class, by parameter field is updated
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void getBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void brake(int amount) {
        if (this.speed > 0 && this.speed >= amount) {this.speed -= amount;} else {
            this.speed = 0;
        }
    }

}