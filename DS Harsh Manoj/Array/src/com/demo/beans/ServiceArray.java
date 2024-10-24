package com.demo.beans;

public class ServiceArray {

	public static int findMax(int[] arr) {
		int max= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int min= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}

	public static int FindSecondMax(int[] arr) {
		int max=arr[0];
		int smax=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			if(smax<arr[i] && max>arr[i]) {
				smax=arr[i];
			}
		}
		return smax;
	}

	public static int AddPrime(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static int SequetialSearch(int[] arr, int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
	}

	

}
