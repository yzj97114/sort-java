package com.zzzsj.sort.insertion;

import com.zzzsj.sort.IArraySort;

/**
 * @author 79282
 * 插入排序: 将第一待排序序列第一个元素看做一个有序序列,之后的元素看成未排序序列
 * 从头到尾扫描未排序序列,将扫描到的元素插入有序序列的适当位置
 * 时间复杂度:O(n²)
 * 空间复杂度:O(1)
 */
public class InsertionSort implements IArraySort {
    @Override
    public int[] sort(int[] arr) {
        //从下标为1的元素开始选择合适位置插入
        for (int i = 1; i < arr.length; i++) {
            //记录要插入的数据
            int temp = arr[i];
            //从已经排序的序列最右边开始比较 找到比其小的数
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            //程序运行到这,存在比其小的数,插入
            if (j != i) {
                arr[j] = temp;
            }
        }
        return arr;
    }
}
