//Given an array with values indicating that how many jumps can be made from that values index forward
//Find out the minimum number of jumps needed to reach from start to end
//TC-O(N*N)
//SC-O(N)

package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMumJumpsToReachTheEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int dp[]=new int[n];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]+j>=i) {
					if(dp[j]!=Integer.MAX_VALUE) {
						dp[i]=Math.min(dp[i],dp[j]+1);
					}
				}
			}
		}
		
		System.out.println(dp[n-1]);

	}

}
