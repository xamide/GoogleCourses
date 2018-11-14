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

        // add sorted array values into integer list
        // remove duplicates from the list and add them to the array
        for (int b = 0; b < a.length; b++) {
            arr.add(a[b]);
            for (int v = b; v < arr.size(); v++) {
                if (arr.contains(arr.get(v))) {
                    arr.remove(v);
                }

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
