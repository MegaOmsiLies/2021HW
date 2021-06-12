public class QuadraticSort {
    public QuadraticSort() {
    }
import java.util.Arrays;


public class QuadraticSort {
    public void sort(int[] data) {
        int n = data.length;

        for(int i = 1; i < n; ++i) {
            int key = data[i];

            int j;
            for(j = i - 1; j >= 0 && data[j] > key; --j) {
                data[j + 1] = data[j];
            }

            data[j + 1] = key;
        }

    }
}
