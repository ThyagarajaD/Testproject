package com.kodnest.array.sorting;

import java.util.Scanner;

public class BubblesortApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	//Creating the array
	int[]arr = new int[scan.nextInt()];
	//Storing the elements
	System.out.println("Enter "+arr.length+" numbers to be stored in array" );
	for(int i=0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	//Displaying the array elements before sorting
	System.out.println("Before sorting the array is:");
	for(int i=0; i<=arr.length-1; i++)
	{
	System.out.print(arr[i]+" ");	
	}
	System.out.println();
	//Calling the bubble sorting () and storing the returned stored array in sorted arr
	int[]sortedArr = Bubblesort.bubblesorting(arr);
	////Displaying the array elements after sorting
	System.out.println("After sorting the array is: ");
	for(int i=0; i<=sortedArr.length-1; i++)
	{
		System.out.print(sortedArr[i]+ " ");
	}
	
	}
}
