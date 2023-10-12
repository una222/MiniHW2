package Vehicle;

public abstract class Drivable extends Vehicle {
    public abstract void accelerate(float speed);
    public abstract void brake();
    public abstract void turn(float angle);
    public abstract float getDirection(); 
    public abstract float getSpeed();   
    public abstract String getMake();    
    public abstract String getType();
}
