package com.blankspace.sort;

public class QuickSortRecursion implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int length = records.length;
        quickSort(records, 0, length - 1);
        return records;
    }

    private void quickSort(int[] records, int first, int end) {
        if (first < end) {
            // 一次划分
            int pivot = partition(records, first, end);
            // 对左侧子序列快速排序
            quickSort(records, first, pivot - 1);
            // 对右侧子序列快速排序
            quickSort(records, pivot + 1, end);
        }
    }

    /**
     * 一次划分算法
     *
     * @param first 区间左下标
     * @param last  区间右下标
     * @return 中轴
     */
    private int partition(int[] records, int first, int last) {
        // 初始化一次划分区间
        int i = first, j = last, temp;
        while (i < j) {
            // 右侧扫描
            while (i < j && records[i] <= records[j]) {
                j--;
            }
            // 将较小记录交换到前面
            if (i < j) {
                temp = records[i];
                records[i] = records[j];
                records[j] = temp;
                i++;
            }
            // 左侧扫描
            while (i < j && records[i] <= records[j]) {
                i++;
            }
            // 将较大记录交换到后面
            if (i < j) {
                temp = records[i];
                records[i] = records[j];
                records[j] = temp;
                j--;
            }
        }
        // i为轴值记录的最终位置
        return i;
    }

}
