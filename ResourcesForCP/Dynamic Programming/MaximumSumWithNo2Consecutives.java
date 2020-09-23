package dynamicprogramming;
import java.util.*;
public class MaximumSumWithNo2Consecutives {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(max(arr,n));
	}
	
	static int max(int arr[],int n){
		if(n==1) return arr[0];
		else if(n==0) return 0; 
		
		int res=max(arr,n-1);
		res=Math.max(res,arr[n-1]+max(arr,n-2));
		
		return res;
	}

}
