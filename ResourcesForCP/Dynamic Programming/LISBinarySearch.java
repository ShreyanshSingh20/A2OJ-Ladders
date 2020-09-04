package dynamicprogramming;

import java.util.Scanner;

public class LISBinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int tail[]=new int[n];
		tail[0]=arr[0];
		int len=1;
		for(int i=1;i<n;i++) {
			if(arr[i]>tail[len-1]) {
				tail[len]=arr[i];
				len++;
			}else {
				int index=ceilbs(tail,0,len-1,arr[i]);
				tail[index]=arr[i];
			}
		}
		
		System.out.println(len);

	}
	
	static int ceilbs(int tail[],int l,int r,int x) {
		while(r>l) {
			int m=l+((r-l)/2);
			if(tail[m]>=x) r=m;
			else l=l+1;
		}
		
		return r;
	}

}
