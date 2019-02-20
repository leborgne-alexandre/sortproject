package com.esgi;

public class BubbleSort implements Sort<Integer> {
    @Override
    public void exec(Integer[] arr) {
        this.exec(arr, true);
    }

    @Override
    public void exec(Integer[] arr, boolean ascOrDesc) {
        boolean swapNeeded = true;
        int laps = 0;
        while(swapNeeded) {
            swapNeeded = false;
            laps += 1;
            for (int i = 0; i < arr.length - laps; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtils.swap(arr, i, i + 1);
                    swapNeeded = true;
                }
            }
        }
    }
}
