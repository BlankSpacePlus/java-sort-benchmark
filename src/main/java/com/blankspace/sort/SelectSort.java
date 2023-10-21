package com.blankspace.sort;

public class SelectSort implements SortInterface {

    @Override
    public void sort(int[] records) {
        int length = records.length, index, temp;
        // n-1趟的简单排序
        for (int i = 0; i < length; i++) {
            index = i;
            // 在无序区查找最小记录，并置于新有序区最后一位
            for (int scan = i + 1; scan < length; scan++) {
                if (records[scan] < records[index]) {
                    index = scan;
                }
            }
            if (index != 1) {
                temp = records[i];
                records[i] = records[index];
                records[index] = temp;
            }
        }
    }

}
