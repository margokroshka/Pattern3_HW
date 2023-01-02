package F;

public class ManagerWorker implements Worker {
    @Override
    public String Work() {
        return "Командую!!!";
    }

    @Override
    public String Relax() {
        return "Пью кофе!)";
    }
}
