package Assignment1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int largest=arr[0];
		int secondLargest=arr[1];
		for(int i=1;i<n;i++) {
			if(largest<arr[i]) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest+" "+largest);
		sc.close();
	}
}
