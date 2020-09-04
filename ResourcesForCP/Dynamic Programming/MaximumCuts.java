package dynamicprogramming;
import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 
public class MaximumCuts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(rec(n,a,b,c));
		

	}
	
	static int rec(int n,int a,int b,int c) {
		if(n<0) return -1;
		if(n==0) return 0;
		int res=Math.max(Math.max(rec(n-a,a,b,c),rec(n-b,a,b,c)),rec(n-c,a,b,c));
		 
		if(res==-1) {
			return res;
		}
		
		else return res+1;
		
		
	}

}
