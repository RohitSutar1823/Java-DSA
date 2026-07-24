package Arrays;

import java.util.Scanner;

public class Wave_Print_A_Matrix {

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
		
		System.out.println("Wave printing of matrix is:");
		for(int j = 0; j<3; j++)
		{
			if((j%2)==0)
			{
				for(int i = 0; i<3; i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int i=2;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}

	}

}
