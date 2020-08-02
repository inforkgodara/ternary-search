# Ternary Search

A simple single class implementation of ternary search in Java. The user will be prompted to input the number of elements in a list which they want to enter. It is similar to binary search where we divide the array into two parts but in this algorithm. In this, we divide the given array into three parts and determine which has the key (searched element). We can divide the array into three parts by taking middle1 and middle2 which can be calculated as shown below. Initially, left and right will be equal to 0 and length-1 respectively, where length is the length of the array. The ternary search algorithm will be performed, and the index at which the element was found will be returned or the code will notify that it could not find the element.

## How to use it.
* Open a command prompt window and go to the directory where you saved the java program (TernarySearch.java).
* Type 'javac TernarySearch.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line.
* Now, type 'java TernarySearch' to run your program.
* You will be able to see an output line and asking input to enter the number of elements you want to enter.
* Next you will enter the number of elements it can be space-separated or in a new line.
* After completion of entering elements in the list, the program will be asking for the element which you want to search.
* And finally you see the result in which index given element is available in the list. in case of an unavailable element, error message will be printed on the screen.

## Code
```
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
```
