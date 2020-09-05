//Given a val, and a set of values of coins, find the minimum number of coins required to completely pay the value

package dynamicprogramming;

import java.util.Scanner;

public class MinimumCoinsDP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int n=sc.nextInt();
		int coins[]=new int[n];
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();
		}
		
		int dp[]=new int[val+1];
		dp[0]=0;
		for(int i=1;i<val+1;i++) {
			dp[i]=Integer.MAX_VALUE;
		}
		
		for(int i=1;i<=val;i++) {
			for(int j=0;j<n;j++) {
				if(i>=coins[j]) {
					int sub=dp[i-coins[j]];
					if(sub!=Integer.MAX_VALUE) dp[i]=Math.min(dp[i],sub+1);
				}
			}
		}
		
		System.out.println(dp[val]);

	}
	

}
