package dynamicprogramming;
import java.util.*;
public class LCSTabulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		int arr[][]=new int[n+1][m+1];
		for(int i=0;i<m+1;i++) {
			arr[0][i]=0;
		}
		
		for(int i=0;i<n+1;i++) {
			arr[i][0]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					arr[i][j]=1+arr[i-1][j-1];
				}else {
					arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
				}
			}
		}
		
		System.out.println(arr[n][m]);
		

	}

}
