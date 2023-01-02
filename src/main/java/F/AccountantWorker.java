package F;

public class AccountantWorker implements Worker {
    @Override
    public String Work() {
        return "Счетаю...";
    }

    @Override
    public String Relax() {
        return "Сплю....";
    }
}
