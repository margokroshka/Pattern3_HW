package F;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Department department = getWorker("Manage");
        System.out.println(department.recruit());
    }

    static Department getWorker(String text) throws FileNotFoundException {
        switch (text){
            case "Manage": return new ManageDepartment();
            case "Accountant": return new AccountantDepartment();
            default: throw new FileNotFoundException();
        }
    }
    }

