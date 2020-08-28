package dynamicprogramming;

import java.util.Scanner;

public class CoinChangeTabulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int n=sc.nextInt();
		int coins[]=new int[n];
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();
		}
		
		int mat[][]=new int[sum+1][n+1];
		for(int i=0;i<n;i++) {
			mat[0][i]=1;
		}
		
		for(int i=1;i<sum;i++) {
			mat[i][0]=0;
		}
		
		for(int i=1;i<=sum;i++) {
			for(int j=1;j<=n;j++) {
				mat[i][j]=mat[i][j-1];
				if(coins[j-1]<=i) {
					mat[i][j]+=mat[i-coins[j-1]][j];
				}
			}
		}
		
		System.out.println(mat[sum][n]);

	}

}
