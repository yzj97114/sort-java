package com.zzzsj.sort.bubble;

import com.zzzsj.sort.IArraySort;

import java.util.Arrays;

/**
 * @author 79282
 * 冒泡排序: 比较相邻的元素,如果第一个比第二个大 就交换
 * 时间复杂度:(最好情况)O(n)²
 * 空间复杂度:O(1)
 */
public class BubbleSort implements IArraySort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
