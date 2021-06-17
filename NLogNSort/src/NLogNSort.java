public class NLogNSort {
    public void sort(int[] array)
    {
        boolean sorting = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                sorting = false;
            }
        }

        if (sorting) {
            return;
        }

        HeapSort(array);
    }

    private int[] HeapSort(int[] array) {
        bullhead(array);
        for (int i = array.length - 1; i >= 0; i--) {
            swap(array, i, 0);
            restoreHeap(array, i, 0);
        }
        return array;
    }

    private void bullhead(int[] array) {
        int middle = (array.length / 2) - 1;

        for (int i = middle; i > -1; i--) {
            restoreHeap(array, (array.length - 1), i);
        }
    }

    private void restoreHeap(int[] data, int size, int index) {
        int left = ((2 * index) + 1);
        int right = ((2 * index) + 2);
        int maximum = index;

        if ((left < size) && (data[left] > data[index])) {
            maximum = left;
        }

        if ((right < size) && (data[right] > data[maximum])) {
            maximum = right;
        }

        if (maximum != index) {
            swap(data, index, maximum);
            restoreHeap(data, size, maximum);
        }
    }


    private static void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }
}