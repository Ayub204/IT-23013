import java.util.HashMap;

/*
 * Program: Employee ID to Department mapping
 */
public class EmployeeHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(201, "HR");
        employees.put(202, "IT");
        employees.put(203, "Finance");

        System.out.println("Employee Records:");
        System.out.println(employees);
    }
}
