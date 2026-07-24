package Arrays;

import java.util.Scanner;

public class Transpose_of_a_Matrix {

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
		
		int ans[][] = new int[3][3];
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				ans[j][i] = arr[i][j];
			}
		}
		
		System.out.println("The Transpose matrix is:");
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
