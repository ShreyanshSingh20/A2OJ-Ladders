//given two strings s1 and s2, convert s1 to s2 in minimum number of following operations
//insert
//delete
//replace
//at last print the number of minimum number of operations performed

package dynamicprogramming;
import java.util.*;
public class EditDistanceProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		
		System.out.println(ED(s1,s2,n,m));

	}
	
	static int ED(String s1,String s2,int n,int m) {
		if(n==0) return m;
		if(m==0) return n;
		
		if(s1.charAt(n-1)==s2.charAt(m-1)) {
			return ED(s1,s2,n-1,m-1);
		}else {
			return 1+Math.min(Math.min(ED(s1,s2,n,m-1), ED(s1,s2,n-1,m)), ED(s1,s2,n-1,m-1));
		}
	}

}
