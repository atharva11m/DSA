import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {90,10,80,40,20,50,70,60,30};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("sorted array"+Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr) {
		boolean flag;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
	}
}