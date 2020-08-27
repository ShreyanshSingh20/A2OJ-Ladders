package dynamicprogramming;
import java.util.*;
public class LCSMemoization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		//find longest length of the common subsequence
		int arr[][]=new int[n+1][m+1];
		System.out.println(lcs(arr,s1,s2,n,m));

	}
	
	static int lcs(int arr[][],String s1,String s2,int n,int m) {
		if(arr[n][m]==0) {
			int res=0;
			if(n==0||m==0) {
				res=0;
			    return res;
			}
			if(s1.charAt(n-1)==s2.charAt(m-1)) {
				res=1+lcs(arr,s1,s2,n-1,m-1);
			}
			else {
				res=Math.max(lcs(arr,s1,s2,n,m-1),lcs(arr,s1,s2,n-1,m));
			}
			
			arr[n][m]=res;
		}
		
		return arr[n][m];
	}

}
