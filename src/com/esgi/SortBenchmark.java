package com.esgi;

public class SortBenchmark {

    private int size;

    public SortBenchmark(int size) {
        this.size = size;
    }

    public void bench(Sort<Integer>... sorts) {
        Integer[] numbers = new Integer[this.size];
        for(int i = 0; i < numbers.length; i++) {
            int rand = (int) (Math.random() * this.size);
            numbers[i] = rand;
        }
        for(int i = 0; i < sorts.length; i++) {
            long start = System.currentTimeMillis();
            Sort<Integer> s = sorts[i];
            s.exec(numbers.clone()); // clone -> copy
            long end = System.currentTimeMillis();
            System.out.println(s.getClass().getSimpleName() + ": " + (end  - start) + " ms");
        }

    }

}