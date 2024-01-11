import java.util.Arrays;

public class selectionSort {
public static void main(String[] args) {
	int[] arr= {90,10,80,40,20,50,70,60,30};
	System.out.println(Arrays.toString(arr));
	selectionSort(arr);
	System.out.println("sorted array"+Arrays.toString(arr));
}
public static void selectionSort(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	//System.out.println(Arrays.toString(arr));
	
}
}
