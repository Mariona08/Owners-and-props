public class Owner {
    private String name;
    private String address;
    private Prop[] props;
    private int numProps;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.props = new Prop[5];  // capacitat màxima de 5
        this.numProps = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumProps() {
        return numProps;
    }

    public Prop[] getProps() {
        return props;
    }

    public void addProp(Prop p){
        if(numProps< props.length){
            props[numProps]=p;
            numProps ++;
        }
    }

    public float cheapestPrice(){

    }

}
