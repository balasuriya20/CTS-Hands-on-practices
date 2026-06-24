package week1_DSA;

import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,2,4,5,6,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}for(int m:arr)
		System.out.print(m+" " );
	}
}
