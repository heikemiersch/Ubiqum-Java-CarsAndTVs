public class Main {

    public static void main (String[] args) {
        Car ferrari = new Car("ferrari", "portofino", 0);
        Car jag = new Car("jaguar", "e-type", 0);
        ferrari.accelerate(20);
        ferrari.accelerate(120);
        ferrari.brake(160);
        jag.accelerate(120);
        jag.brake(30);
        System.out.println(ferrari.getBrand() + " " + ferrari.getModel() + " running at " + ferrari.getSpeed() + " km/h");
        System.out.println(jag.getBrand() + " " + jag.getModel() + " running at " + jag.getSpeed() + " km/h");

        System.out.println("Hello World.");
    }
}
