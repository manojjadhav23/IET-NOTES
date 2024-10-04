package Array2d;
import java.util.*;
public class Array_2D {

	public static void main(String[] args) {
		 int[][] arr=new int[3][2];
		 int choice=0;
		 Scanner sc = new Scanner(System.in);
		 do {
			 System.out.println("1)Accept Value \n2)Display Value \n3)Minimum Element in Array \n4)MAximum Element in Array \nChoice:");
			 choice = sc.nextInt();
			 switch(choice){
			 case 1:ArrayService.AcceptValue(arr);
			 	break;
			 case 2: ArrayService.DisplayValue(arr);
			 	break;
			 case 3:ArrayService.MinEleArray(arr);
			 	break;
			 case 4:ArrayService.MaxEleArray(arr);
			 	break;
			 case 5:ArrayService.AddRowWise(arr);	
			 	break;
			 case 6:ArrayService.AddColWise(arr);
			 }
				 }while(choice!=6);
		 
				 
				
				 
				 
	}

}
