package Vehicle;

public class Boat extends Sailable {
    private boolean sailHoisted;

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    public void landHo() {
        // Implement landing logic for a sailboat
    }
}
