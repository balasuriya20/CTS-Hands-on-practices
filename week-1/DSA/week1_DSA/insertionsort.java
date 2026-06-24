package week1_DSA;

import java.util.Arrays;

public class insertionsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,5,32,43,5,7,3};
	     for(int i=1;i<arr.length;i++) {
	    	 int key=arr[i];
	    	 int j=i-1;
	    	 while(j>=0 && arr[j]>key) {
	    		 arr[j+1]=arr[j];
	    		 j--;
	    	 }
	    	 arr[j+1]=key;
		}System.out.println(Arrays.toString(arr));
	}
}
