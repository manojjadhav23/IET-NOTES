package com.demo.test;

import java.util.Scanner;

import com.demo.beans.ServiceArray;

public class TestArray {

	public static void main(String[] args) {
		int []arr = {30,2,4,40,6,8};
		
		int max=ServiceArray.findMax(arr);
		System.out.println("Maximum number is:"+max);
		
		int min=ServiceArray.findMin(arr);
		System.out.println("Minimum number is:"+min);
		
		int SecondMax=ServiceArray.FindSecondMax(arr);
		System.out.println("Second Maximum number is:"+SecondMax);
		
		int sum=ServiceArray.AddPrime(arr);
		System.out.println("Addition of Prime Number is:"+sum);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to Search:");
		int Search = sc.nextInt();
		int pos=ServiceArray.SequetialSearch(arr,Search);
		if(pos!=-1) {
			System.out.println("Number " +Search+" is Found at "+pos);
		}else {
			System.out.println("Not Found");
		}
		sc.close();
	}

}
