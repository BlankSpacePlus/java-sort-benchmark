package com.blankspace.sort;

public class MergeSortRecursion implements SortInterface {

    @Override
    public int[] sort(int[] records) {
        int length = records.length;
        mergeSort(records, length, 0, length - 1);
        return records;
    }

    public void mergeSort(int[] record, int length, int first, int last) {
        // 待排序的序列只有一条记录，递归结束
        if (first == last) {
            return;
        } else {
            int mid = (first + last) / 2;
            // 归并排序前半个序列
            mergeSort(record, length, first, mid);
            // 归并排序后半个序列
            mergeSort(record, length, mid + 1, last);
            // 将已排序的两个序列合并
            merge(record, length, first, mid, last);
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
