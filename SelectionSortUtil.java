import java.util.ArrayList;
import java.util.Comparator;

// Utility class to perform selection sort on an ArrayList of students
public class SelectionSortUtil {
    // Generic method to perform selection sort
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                // Compare the elements to find the smallest
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the elements if a smaller element is found
            if (minIndex != i) {
                Student temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
    }
}