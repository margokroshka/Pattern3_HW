package AF;

public class RedFabric implements Fabric{
    public Mers getMers() {
        return new RedMedrs();
    }

    public BMW getBMW() {
        return new RedBMW();
    }
}
