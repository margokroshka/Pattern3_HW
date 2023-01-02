package F;

public class ManageDepartment extends Department{
    @Override
    Worker getWorker() {
        return new ManagerWorker();
    }
}
