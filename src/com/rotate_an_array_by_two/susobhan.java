package com.rotate_an_array_by_two;
import java.util.Scanner;
public class susobhan {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many numbers u want to rotate");
		int rotate= sc.nextInt();
		int arr[]= {9,8,6,4,3,2,1};
		int n= arr.length;
		
		int arr2[]= new int[n-rotate];
		int arr3[]= new int[rotate];
		
		int k=0;
		int j =0;
		
		// how many nuber i have to rotate leaving  that reamining  should be copied to arr2 from arr;
		for(int i =rotate;i<n;i++) {
			arr2[j]=arr[i];
			j++;
		}
		
		
		
		
		
		// upto which i have to rotate that should be copied to arr3(newly created) from arr;
		for(int i=0;i<rotate;i++)
	{
		arr3[k]=arr[i];
			k++;
			}
		
		
		
		
		
//		// print the firstly created new array;
		
		for(int i =0;i<arr2.length;i++) {		
			System.out.print(arr2[i]+" ");
			
			
		}
		
		//print the secondly created new array
		for(int i =0;i<arr3.length;i++) {		
			System.out.print(arr3[i]+" ");
			
			
		}
	

		
	}
}
