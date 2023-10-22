package com.blankspace.sort;

public class MergeSortIteration implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int length = records.length;
        mergeSort(records, length);
        return records;
    }

    public void mergeSort(int[] record, int length) {
        // 初始时子序列长度为1
        int h = 1;
        while (h < length) {
            // 一趟排序
            mergePass(record, length, h);
            h *= 2;
        }
    }

    private void mergePass(int[] record, int length, int h) {
        int i = 0;
        // 有两个长度为h的子序列
        while (i <= length - 2 * h + 1) {
            merge(record, length, i, i + h - 1, i + 2 * h - 1);
            i += 2 * h;
        }
        // 子序列有一个长度小于h
        if (i < length - h + 1) {
            merge(record, length, i, i + h - 1, length - 1);
        }
    }

    private void merge(int[] record, int length, int first1, int last1, int last2) {
        // 定义辅助数组temp
        int[] temp = new int[length];
        // 设置两个待合并的起止区间
        int i = first1, j = last1 + 1, index = first1;
        // 依次取两序列中小者放入temp
        while (i <= last1 && j <= last2) {
            if (record[i] <= record[j]) {
                temp[index++] = record[i++];
            } else {
                temp[index++] = record[j++];
            }
        }
        // 对第一个子序列进行收尾处理
        while (i <= last1) {
            temp[index++] = record[i++];
        }
        // 对第二个子序列进行收尾处理
        while (j <= last2) {
            temp[index++] = record[j++];
        }
        // 将合并后的结果传回数组record
        for (index = first1; index <= last2; index++) {
            record[index] = temp[index];
        }
    }

}
