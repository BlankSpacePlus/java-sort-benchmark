package com.blankspace.sort;

public class QuickSort implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int length = records.length;
        quickSort(records, 0, length - 1);
        return records;
    }

    private void quickSort(int[] record, int first, int end) {
        if (first < end) {
            // 一次划分
            int pivot = partition(record, first, end);
            // 对左侧子序列快速排序
            quickSort(record, first, pivot - 1);
            // 对右侧子序列快速排序
            quickSort(record, pivot + 1, end);
        }
    }

    /**
     * 一次划分算法
     *
     * @param first 区间左下标
     * @param last  区间右下标
     * @return 中轴
     */
    private int partition(int[] record, int first, int last) {
        // 初始化一次划分区间
        int i = first, j = last, temp;
        while (i < j) {
            // 右侧扫描
            while (i < j && record[i] <= record[j]) {
                j--;
            }
            // 将较小记录交换到前面
            if (i < j) {
                temp = record[i];
                record[i] = record[j];
                record[j] = temp;
                i++;
            }
            // 左侧扫描
            while (i < j && record[i] <= record[j]) {
                i++;
            }
            // 将较大记录交换到后面
            if (i < j) {
                temp = record[i];
                record[i] = record[j];
                record[j] = temp;
                j--;
            }
        }
        // i为轴值记录的最终位置
        return i;
    }

}
