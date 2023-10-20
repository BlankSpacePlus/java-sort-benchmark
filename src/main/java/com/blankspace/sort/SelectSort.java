package com.blankspace.sort;

public class SelectSort implements SortInterface {

    @Override
    public void sort(int[] record) {
        int length = record.length, index, temp;
        // n-1趟的简单排序
        for (int i = 0; i < length; i++) {
            index = i;
            // 在无序区查找最小记录，并置于新有序区最后一位
            for (int scan = i + 1; scan < length; scan++) {
                if (record[scan] < record[index]) {
                    index = scan;
                }
            }
            if (index != 1) {
                temp = record[i];
                record[i] = record[index];
                record[index] = temp;
            }
        }
    }

}