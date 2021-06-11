package code;

public class DynamicArray {
public class DynamicArray <T>{
    private final int SIZE = 10;
    private final int RATE = 2;
    private T[] Arr;

    public DynamicArray(){
        Arr = (T[])new Object[SIZE];

    }

    public DynamicArray(int firstSize){
        if (firstSize > -1) {
            Arr = (T[]) new Object[firstSize];
        }
        else {Arr = (T[])new Object[SIZE];}
    }

    public T get(int index){
        if(capacity() <= index | index < 0){throwException();}
        return Arr[index];
    }

