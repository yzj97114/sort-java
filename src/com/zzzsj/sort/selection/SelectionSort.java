package com.zzzsj.sort.selection;

import com.zzzsj.sort.IArraySort;


/**
 * @author 79282
 * 选择排序:从头到尾依次寻找最小(大)元素 存放到排序其实位置
 * 时间复杂度:O(n²)
 */
public class SelectionSort implements IArraySort {
    @Override
    public int[] sort(int[] arr) {
        //总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            //定义最小值的下标为i
            int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                //找出最小值下标
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //将最小值和i交换
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
