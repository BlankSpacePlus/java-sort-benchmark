package com.blankspace.sort;

public class HeapSort implements SortInterface {

    @Override
    public void sort(int[] records) {
        int length = records.length, temp = 0;
        // 从最后一个分支节点至根结点
        for (int index = length / 2 - 1; index >= 0; index--) {
            sift(records, index, length - 1);
        }
        for (int i = 1; i < length; i++) {
            // 暂存最大元素
            temp = records[0];
            // 最右叶子放到根结点
            records[0] = records[length - i];
            records[length - i] = temp;
            // 对 r[0]~r[length-i-1]建堆
            sift(records, 0, length - i - 1);
        }
    }

    /**
     * 左右子树都是大根堆，以此方法实现指定节点调整
     * @param key 待调整节点
     * @param last 右侧端点
     */
    private void sift(int[] record, int key, int last) {
        // 暂存变量
        int temp;
        // siftNode为待调整结点
        int siftNode = key;
        // max初始化为siftNode的左孩子
        int max = 2 * siftNode + 1;
        while (max <= last) {
            // 选取左右孩子较大者
            if (max < last && record[max] < record[max + 1]) {
                max++;
            }
            // 已经是堆
            if (record[siftNode] > record[max]) {
                break;
            } else {
                // 待调整结点与max互换
                temp = record[siftNode];
                record[siftNode] = record[max];
                record[max] = temp;
                // siftNode、max重新赋值，准备下一趟调整
                siftNode = max;
                max = 2 * siftNode + 1;
            }
        }
    }

}
