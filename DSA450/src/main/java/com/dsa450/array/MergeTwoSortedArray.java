package com.dsa450.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        MergeTwoSortedArray obj = new MergeTwoSortedArray();
        obj.merge(arr1, arr2);
    }
    public void merge(int[] arr1, int[] arr2){


        int[] a = {1,2};
 // {2,1}
        a[0] = a[0] + a[1];// {3,2}
        a[1] = a[0] - a[1]; // {3,1}
        a[0] = a[0] - a[1]; // {2,1}
    }
}
