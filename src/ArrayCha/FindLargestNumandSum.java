package ArrayCha;

import java.util.Arrays;

public class FindLargestNumandSum {
	
	public static int largestNumSum(int[] arr) {
		 Arrays.sort(arr);
//		 for(int e:arr) {
//			System.out.println(e); 
//		 }
		int sum=0;
//		Sollution 1
//		sum = arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3]+arr[arr.length-4];
//		Sollution 2		
		for(int i=arr.length-1;i>=arr.length-4;i--) {
			sum=sum+(arr[i]);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int[] num= new int[5];
		num[0]=100;
		num[1] = 60;
		num[2]= 20;
		num[3]=1;
		num[4]=45;
	System.out.println(largestNumSum(num));

	}

}
