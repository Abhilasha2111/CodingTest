package com.pair.sum;
import java.util.Scanner;
public class SumOfPair 
{
	public static void Pair(int[] numArr, int sum, int n) 
	{
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (numArr[i] + numArr[j] == sum) 
				{
					System.out.println("\tPair found (" + numArr[i] + "," + numArr[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements for the array: ");
		int n = scan.nextInt();
		System.out.print("  ");
		int[] numArr= new int[n];
		for(int i=0;i<n;i++)
		{
		numArr[i] = scan.nextInt();
		System.out.print("  ");
		}
		System.out.print("Enter the Sum you want: ");
		int sum=scan.nextInt();
        Pair(numArr, sum, n);
        scan.close();
	}
}
