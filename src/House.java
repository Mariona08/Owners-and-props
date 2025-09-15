public class House extends Prop{
    private int numRooms;
    private boolean swimingpool;

    public House(String propID, String address, String city, int numRooms) {
        super(propID, address, city);
        this.numRooms = numRooms;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isSwimingpool() {
        return swimingpool;
    }

    public void setSwimingpool(boolean swimingpool) {
        this.swimingpool = swimingpool;
    }
}
