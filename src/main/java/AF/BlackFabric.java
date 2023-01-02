package AF;

public class BlackFabric implements Fabric{
    public Mers getMers() {
        return new BlackMers();
    }

    public BMW getBMW() {
        return new BlackBMW();
    }
}
