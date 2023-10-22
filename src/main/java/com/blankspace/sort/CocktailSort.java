package com.blankspace.sort;

public class CocktailSort implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int tmp = 0;
        for (int i = 0; i < records.length/2; i++) {
            // 有序标记，每一轮初始值都是true
            boolean isSorted = true;
            // 奇数轮，从左向右比较和交换
            for (int j = i; j < records.length-i-1; j++) {
                if (records[j] > records[j+1]) {
                    tmp = records[j];
                    records[j] = records[j+1];
                    records[j+1] = tmp;
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
            for (int j = records.length-i-1; j > i; j--) {
                if (records[j] < records[j-1]) {
                    tmp = records[j];
                    records[j] = records[j-1];
                    records[j-1] = tmp;
                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return records;
    }

}
