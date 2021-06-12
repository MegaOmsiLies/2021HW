import java.util.Arrays;

public class QuadraticSort {
    public void sort(int[] data)
    {
        for (int i = 1; i < data.length; ++i) {
            int j = i - 1;
            int K = data[i];
            
            while (j >= 0 && data[j] > K) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = K;
        }
    }
}