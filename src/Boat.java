public class Boat extends Prop {
    private float length;
    private boolean navigable;

    public Boat(String propID, String address, String city, float length, boolean navigable) {
        super(propID, address, city);
        this.length = length;
        this.navigable = navigable;
    }

    public boolean isNavigable() {
        return navigable;
    }

    public void setNavigable(boolean navigable) {
        this.navigable = navigable;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
