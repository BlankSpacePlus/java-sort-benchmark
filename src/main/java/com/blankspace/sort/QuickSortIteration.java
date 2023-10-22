package com.blankspace.sort;

import java.util.ArrayDeque;
import java.util.Deque;

public class QuickSortIteration implements SortInterface {
    @Override
    public int[] sort(int[] records) {
        if (records == null || records.length == 0) {
            return records;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        stack.push(records.length - 1);
        while (!stack.isEmpty()) {
            int high = stack.pop();
            int low = stack.pop();
            int pivotIndex = partition(records, low, high);
            if (pivotIndex - 1 > low) {
                stack.push(low);
                stack.push(pivotIndex - 1);
            }
            if (pivotIndex + 1 < high) {
                stack.push(pivotIndex + 1);
                stack.push(high);
            }
        }
        return records;
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
