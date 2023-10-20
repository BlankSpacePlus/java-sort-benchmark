package com.blankspace.sort;

public class BubbleSort implements SortInterface {

    @Override
    public void sort(int[] record) {
        // 第一趟冒泡排序的区间是r[0]~r[length-1]
        int length = record.length, exchange = length - 1;
        int position, bound, temp;
        // 当上一趟排序有记录交换的时候
        while (exchange != 0) {
            bound = exchange;
            exchange = 0;
            for (position = 0; position < bound; position++) {
                if (record[position] > record[position + 1]) {
                    temp = record[position];
                    record[position] = record[position + 1];
                    record[position + 1] = temp;
                    // 记载每一次记录交换的位置
                    exchange = position;
                }
            }
        }
    }

}
