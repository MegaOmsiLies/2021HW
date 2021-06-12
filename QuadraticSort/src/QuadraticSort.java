import java.util.Arrays;


public class QuadraticSort {
    public void sort(int[] data) {

        for(int i = 1; i < data.length; ++i) {
            int K = data[i];

            int j;
            for(j = i - 1; j >= 0 && data[j] > K; --j) {
                data[j + 1] = data[j];
            }

            data[j + 1] = K;
        }

    }
}
