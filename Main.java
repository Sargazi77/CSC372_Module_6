import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of 10 Student objects with diverse and mixed information
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(52, "Zara", "789 Willow Way"));
        students.add(new Student(15, "Bob", "450 Junction Rd"));
        students.add(new Student(43, "Aeon", "325 Lake Blvd"));
        students.add(new Student(29, "Xenia", "980 Maple Ln"));
        students.add(new Student(4, "Drake", "112 Ocean Dr"));
        students.add(new Student(23, "Ophelia", "250 Canyon Cir"));
        students.add(new Student(38, "Phil", "860 Vine St"));
        students.add(new Student(12, "Quinn", "199 Birch Rd"));
        students.add(new Student(67, "Iris", "321 Pine St"));
        students.add(new Student(8, "Tara", "555 Cedar Ave"));

        // Sort students by name
        System.out.println("Sorting by name:");
        SelectionSortUtil.selectionSort(students, new NameComparator());
        students.forEach(System.out::println);

        // Sort students by roll number
        System.out.println("Sorting by roll number:");
        SelectionSortUtil.selectionSort(students, new RollnoComparator());
        students.forEach(System.out::println);
    }
}
