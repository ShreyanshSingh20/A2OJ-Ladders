package dynamicprogramming;
import java.util.*;
public class CoinChangeMemoization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int n=sc.nextInt();
		int coins[]=new int[n];
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();
		}
		
		int mat[][]=new int[sum+1][n+1];
		 for (int[] row :mat) 
	            Arrays.fill(row, -1); 
		 
		 System.out.println(dpcoin(coins,mat,sum,n));
  
		

	}
	
	static int dpcoin(int coins[],int mat[][],int sum,int n) {
		
		
		if(mat[sum][n]==-1) {
			if(sum==0) return 1;
			if(n==0) return 0;
		int res=dpcoin(coins,mat,sum,n-1);
		if(coins[n-1]<=sum) {
			res=res+dpcoin(coins,mat,sum-coins[n-1],n);
		}
		
		mat[sum][n]=res;
		}
		
		return mat[sum][n];
	}

}
