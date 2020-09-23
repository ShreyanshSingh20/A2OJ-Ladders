package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumWithNo2ConsecutivesDP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int dp[]=new int[n+1];
		Arrays.fill(dp,-1);
		System.out.println(max(arr,n,dp));
		
	}
	
	static int max(int arr[],int n,int dp[]){
		if(dp[n]==-1) {
		if(n==1) return arr[0];
		else if(n==0) return 0; 
		
		int res=max(arr,n-1,dp);
		res=Math.max(res,arr[n-1]+max(arr,n-2,dp));
		dp[n]=res;
		}
		return dp[n];
	}

}
