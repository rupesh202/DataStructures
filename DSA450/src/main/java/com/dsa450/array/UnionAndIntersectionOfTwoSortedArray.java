package com.dsa450.array;

public class UnionAndIntersectionOfTwoSortedArray {

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};

        UnionAndIntersectionOfTwoSortedArray obj = new UnionAndIntersectionOfTwoSortedArray();
//        obj.union(arr1,arr2);
        obj.intersection(arr1,arr2);
    }
    public void intersection(int[] arr1, int[] arr2){

        int k=0;
        for(int i=0; i< arr1.length; i++){

            for(int j= k; j<arr2.length; j++){

                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    k= i;
                    break;
                }
            }
        }
    }
    public void union(int[] arr1, int[] arr2){

        int i =0; int j=0;
        while(i< arr1.length && j< arr2.length){

            if (arr1[i] < arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }else if(arr1[i] > arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }
        while (i< arr1.length){
            System.out.println(arr1[i]);
            i++;
        }
        while (j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }

    }

}
