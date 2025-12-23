import java.util.TreeMap;

/*
 * Program: Student Details using TreeMap
 */
public class StudentTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(101, "Ayoive - ICT");
        students.put(102, "Rahim - CSE");
        students.put(103, "Karim - EEE");

        System.out.println("Student Records:");
        System.out.println(students);
    }
}
