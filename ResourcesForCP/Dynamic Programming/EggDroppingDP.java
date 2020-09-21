package dynamicprogramming;

import java.util.Scanner;

public class EggDroppingDP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		int f=sc.nextInt();
		
		int dp[][]=new int[f+1][e+1];
		for(int i=0;i<f+1;i++) {
			for(int j=0;j<e+1;j++) {
				dp[i][j]=-1;
			}
		}
		
		for(int i=0;i<f+1;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<e+1;i++) {
			dp[0][i]=0;
		}
		for(int i=1;i<e+1;i++) {
			dp[1][i]=1;
		}
		
		for(int i=2;i<f+1;i++) {
			dp[i][1]=i;
		}
		
		for(int i=2;i<f+1;i++) {
			for(int j=2;j<e+1;j++) {
				dp[i][j]=Integer.MAX_VALUE;
				for(int x=1;x<=i;x++) {
					dp[i][j]=Math.min(dp[i][j],1+Math.max(dp[x-1][j-1],dp[i-x][j]));
				}
			}
		}
		
		System.out.println(dp[f][e]);
	}

}
