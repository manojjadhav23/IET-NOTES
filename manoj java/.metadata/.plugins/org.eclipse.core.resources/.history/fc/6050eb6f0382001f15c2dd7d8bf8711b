package Array2d;

import java.util.Scanner;

public class ArrayService {

 
	public static void AcceptValue(int[][] arr) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter array element");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++)
			 {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 
		 
		
		
	}
	 
	public static void DisplayValue(int[][] arr) {
		// TODO Auto-generated method stub
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		 }
		
	}

	public static void MinEleArray(int[][] arr) {
		int min = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
			}
		}
		System.out.println("Minimum Element is:"+min);
		
	}

	public static void MaxEleArray(int[][] arr) {
		// TODO Auto-generated method stub
		int max = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Maximum Element is:"+max);
	}

	public static void AddRowWise(int[][] arr) {
		int[] sumrow = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sumrow[i]+= arr[i][j];
			}
		}
		for(int i=0;i<sumrow.length;i++) {
			System.out.println("Sum of Rows"+i+":"+sumrow[i]);
		}
	}

	public static void AddColWise(int[][] arr) {
		// TODO Auto-generated method stub
		int[] sumcol = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sumcol[j]+= arr[i][j];
			}
		}
		for(int i=0;i<sumcol.length;i++) {
			System.out.println("Sum of colums"+i+":"+sumcol[i]);
		}
	} 
}
