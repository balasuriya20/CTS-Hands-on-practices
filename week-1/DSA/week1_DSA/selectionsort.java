package week1_DSA;

import java.util.Arrays;

public class selectionsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,7,100,8,2,1};
		int temp=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
