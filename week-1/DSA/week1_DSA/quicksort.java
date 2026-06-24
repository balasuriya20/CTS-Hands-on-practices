package week1_DSA;

public class quicksort {
	public static void quicksort(int[] arr,int low,int high) {
		if(low<high) {
		int pi=partition(arr,low,high);
		quicksort(arr,low,pi-1);
		quicksort(arr,pi+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[]= {5,4,55464,96879,645,2,1};
		quicksort(arr,0,arr.length-1);
		for(int num:arr) {
		System.out.print(num+" ");

		}
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
	}

}
