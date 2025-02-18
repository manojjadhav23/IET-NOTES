package com.demo.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,60};
	Scanner sc = new Scanner(System.in);
	System.out.println("search");
	int num=sc.nextInt();
	
	int pos=binarysearch(arr,0,arr.length-1,num);
	if(pos!=1) {
		System.out.println("found"+pos);
	}else {
		System.out.println("not found");
	}

	}

	private static int binarysearch(int[] arr, int low, int high, int num) {
			if(low<=high)
			{
				int mid=(high+low)/2;
				
				if(arr[mid]==num) {
					return mid;
				}
				else if(arr[mid]<num)
				{
					return binarysearch(arr,mid+1,high,num);
				}
				else if(arr[mid]>num)
				{
					return binarysearch(arr,low,mid-1,num);
				}
				
			}
			return -1;
	}

}
