package com.esgi;

public class SelectionSort implements Sort<Integer> {

    @Override
    public void exec(Integer[] arr) {
        this.exec(arr, true);
    }

    @Override
    public void exec(Integer[] arr, boolean ascOrDesc) {
        for(int j = 0; j < arr.length; j++) {
            int m = ascOrDesc ? minimumIndex(arr, j) : maximumIndex(arr, j);
            ArrayUtils.swap(arr, j, m);
        }
    }

    private int minimumIndex(Integer[] arr, int fromIndex) {
        int minIndex = fromIndex;
        for(int i = fromIndex + 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int maximumIndex(Integer[] arr, int fromIndex) {
        int maxIndex = fromIndex;
        for(int i = fromIndex + 1; i < arr.length; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
