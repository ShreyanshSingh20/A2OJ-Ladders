package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int n=sc.nextInt();
		int coins[]=new int[n];
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();
		}
		
		
		 System.out.println(dpcoin(coins,val,n));
		 

	}
	
	
	
static int dpcoin(int coins[],int val,int n) {
		if(val==0) return 0;
	int res=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		if(coins[i]<=val) {
			int sub_res=dpcoin(coins,val-coins[i],n);
			if(sub_res!=Integer.MAX_VALUE) res=Math.min(sub_res+1,res);
		}		
	}
	
	return res;

}

}
