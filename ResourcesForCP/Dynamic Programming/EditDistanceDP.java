package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class EditDistanceDP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		int mat[][]=new int[n+1][m+1];
		 for (int[] row :mat) 
	            Arrays.fill(row, -1); 
		
		System.out.println(ED(mat,s1,s2,n,m));

	}

	static int ED(int mat[][],String s1,String s2,int n,int m) {
		if(mat[n][m]==-1) {
			int res=0;
		if(n==0) { res=m;
			return res;}
		if(m==0) { res=n;
		return res;}
		
		if(s1.charAt(n-1)==s2.charAt(m-1)) {
			res=ED(mat,s1,s2,n-1,m-1);
		}else {
			res= 1+Math.min(Math.min(ED(mat,s1,s2,n,m-1), ED(mat,s1,s2,n-1,m)), ED(mat,s1,s2,n-1,m-1));
		}
		
		mat[n][m]=res;
		
		}
		
		return mat[n][m];
	}
}
