package com.blankspace.sort;

public class InsertSort implements SortInterface {

    @Override
    public void sort(int[] record) {
        int length = record.length, temp, position;
        // 排序进行length-1趟
        for (int i = 1; i < length; i++) {
            // 暂存待插记录
            temp = record[i];
            // 寻找插入位置
            for (position = i; position > 0 && temp < record[position - 1]; position--) {
                // 符合循环条件的依次右移一位
                record[position] = record[position - 1];
            }
            // 插入元素
            record[position] = temp;
        }
    }

}