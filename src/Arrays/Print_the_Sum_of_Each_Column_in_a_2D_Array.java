package Arrays;

import java.util.Scanner;

public class Print_the_Sum_of_Each_Column_in_a_2D_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[3][3];
		System.out.println("Enter matrix element");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix is:");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int j = 0; j<3; j++)
		{
			int sum = 0;
			for(int i = 0; i<3; i++)
			{
				sum = sum+arr[i][j];
			}
			System.out.println("The sum of column "+(j+1)+" is: "+sum);
		}
		
	


	}

}
