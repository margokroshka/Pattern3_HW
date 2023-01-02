package F;

public class AccountantDepartment extends Department{
    @Override
    Worker getWorker() {
        return new AccountantWorker();
    }
}
