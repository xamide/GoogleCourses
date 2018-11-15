import java.util.ArrayList;
import java.util.List;

public class SortedArrays {

    int[] sort(int[] a) {

        int holder, i, j, c;
        List<Integer> arr = new ArrayList<>();

        // sort input array
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    holder = a[i];
                    a[i] = a[j];
                    a[j] = holder;
                }
            }
        }

        // remove duplicates from the list and add sorted array values to the arraylist
        for (int b = 0; b < a.length; b++) {
                if (!arr.contains(a[b])) {
                    arr.add(a[b]);
            }
        }

        int[] sortedArray = new int[arr.size()];

        for (int m = 0; m < arr.size(); m++) {
            sortedArray[m] = arr.get(m);
            System.out.println(sortedArray[m]);
        }

        return sortedArray;
    }
}
