import java.util.Arrays;

public class QuadraticSort {
     public void sort(int[] data)
     {
    boolean sorted = false;
    int temp;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i+1]) {
                temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
                sorted = true;
            }
        }
    }
}
