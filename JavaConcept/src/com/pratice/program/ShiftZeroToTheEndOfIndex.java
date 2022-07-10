package com.pratice.program;

import java.util.Arrays;

public class ShiftZeroToTheEndOfIndex 
{

    public static void main(String[] args) 
    {
        //int[] arr = {0,0,0,1,4,5,0,0,7,8,6,5};
    	int[] arr ={1,0,2,0,0,4,5};
        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0) 
            {
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int [] arr,int i, int j)
    {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }

}
