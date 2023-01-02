package AF;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Fabric fabric=getFabric("Red");
        BMW bmw=fabric.getBMW();
        System.out.println(bmw.getColor());
        Mers mers =fabric.getMers();
        System.out.println(mers.getColor());
    }
    static Fabric getFabric(String color) throws FileNotFoundException {
        switch (color){
            case "Red": return new RedFabric();
            case "Black": return new BlackFabric();
            default: throw new FileNotFoundException();
        }
    }
}
