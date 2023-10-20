package com.blankspace.sort;

public class CocktailSort implements SortInterface {

    @Override
    public void sort(int[] record) {
        int tmp = 0;
        for (int i = 0; i < record.length/2; i++) {
            // 有序标记，每一轮初始值都是true
            boolean isSorted = true;
            // 奇数轮，从左向右比较和交换
            for (int j = i; j < record.length-i-1; j++) {
                if (record[j] > record[j+1]) {
                    tmp = record[j];
                    record[j] = record[j+1];
                    record[j+1] = tmp;
                    // 所有元素交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            // 在偶数轮之前，将isSorted重新标记为true
            isSorted = true;
            // 偶数轮，从右向左比较和交换
            for (int j = record.length-i-1; j > i; j--) {
                if (record[j] < record[j-1]) {
                    tmp = record[j];
                    record[j] = record[j-1];
                    record[j-1] = tmp;
                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

}
