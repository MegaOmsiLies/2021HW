import java.util.Arrays;


public class QuadraticSort {
    public void sort(int[] data)
    {
        for(int i = 1; i < data.length; ++i) {
            int K = data[i];
            int j= i- 1;
            while (j >= 0 && K < data[K]){
                data[K+1] = data[K];
                K--;
            }
            data[K + 1] = j;
    }
}
