package Vehicle;

public class Airplane extends Flyable {
    private float altitude;

    @Override
    public void changeAltitude(float change) {
        altitude += change;
    }

    @Override
    public float getAltitude() {
        return altitude;
    }
}
