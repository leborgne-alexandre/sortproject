package com.esgi;

public class Main {

    public static void main(String[] args) {

        SelectionSort s = new SelectionSort();
        Sort<Integer> bs = new BubbleSort();

        SortBenchmark sortBenchmark = new SortBenchmark(1000000);
        sortBenchmark.bench(new QuickSort(), s);


    }
}
