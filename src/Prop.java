public class Prop {
    private String propID;
    private String address;
    private String city;
    private float price;

    public Prop(String propID, String address, String city) {
        this.propID = propID;
        this.address = address;
        this.city = city;
    }

    public String getPropID() {
        return propID;
    }

    public void setPropID(String propID) {
        this.propID = propID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCheaperThan(Prop p) {
        return price < p.price;
    }

    public boolean sameCity(Prop p) {
        return city == p.city;
    }
}
