package Vehicle;

public class Car extends Drivable {
    public Car(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWheels = 4; 
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
        System.out.println("Car is accelerating at " + speed + " km/h");
    }

    @Override
    public void brake() {
        this.speed = 0;
        System.out.println("Car has stopped");
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
        System.out.println("Car is turning by " + angle + " degrees");
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }
}

