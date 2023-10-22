package com.blankspace.sort;

public class ShellSort implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int length = records.length, temp, position;
        // 增量为d时直接插入排序
        for (int d = length / 2; d >= 1; d /= 2) {
            for (int i = d; i < length; i++) {
                // 暂存待插记录
                temp = records[i];
                for (position = i; position - d >= 0 && temp < records[position - d]; position -= d) {
                    // 记录后移d位
                    records[position] = records[position - d];
                }
                records[position] = temp;
            }
        }
        return records;
    }

}
