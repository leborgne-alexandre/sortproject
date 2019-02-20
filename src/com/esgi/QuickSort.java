package com.esgi;

public class QuickSort implements Sort<Integer> {
    @Override
    public void exec(Integer[] arr) {
        this.exec(arr, true);
    }

    @Override
    public void exec(Integer[] arr, boolean ascOrDesc) {
        quick(arr, 0, arr.length - 1);
    }

     private void quick(Integer[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quick(arr, start, pivot - 1);
            quick(arr, pivot + 1, end);
        }
     }

    private int partition(Integer[] arr, int start, int end) {
        int pivot = arr[end];
        int cursor = start;
        for (int i = start; i < end; i++) {
            if(arr[i] < pivot) {
                ArrayUtils.swap(arr, i, cursor);
                cursor += 1;
            }
        }
        ArrayUtils.swap(arr, cursor, end);
        return cursor;
    }
}
