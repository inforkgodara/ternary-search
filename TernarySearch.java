import java.util.*;

/**
 * This is an implementation of the ternary search algorithm.
 * @author @inforkgodara
 *
 */
public class TernarySearch {

    /**
     * ternary search implementation.
     * @param list the array to be searched.
     * @param left the integer which has max size of list.
     * @param right the integer which has minimum size of list.
     * @param search the element being looked for in the array.
     * @return the index at which the search element was first found or -1 if not found.
     */
    static int search(int list[], int left, int right, int search) {
        while (right >= left) {
            int middle1 = left + (right - left) / 3;
            int middle2 = right - (right - left) / 3;

            if (list[middle1] == search) {
                return middle1;
            }
            
            if (list[middle2] == search) {
                return middle2;
            }

            if (search < list[middle1]) {
                right = middle1 - 1;
            } else if (search > list[middle2]) {
                left = middle2 + 1;
            } else {
                left = middle1 + 1;
                right = middle2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter length of list : ");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.print("Enter element to search : ");
        int search = scanner.nextInt();
        int elementAt = search(list, 0, length - 1, search);

        String result = elementAt == -1 ? "Element not found." : "Element is at index " + elementAt;
        System.out.println(result);
    }
}