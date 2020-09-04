//Time complexity-->O(n*n) worst case
//LONGEST INCREASING SUBSEQUENCE

package dynamicprogramming;
import java.util.*;
public class LongestIncreasingSubsequenceDP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int lis[]=new int[n];
		lis[0]=1;
		
		for(int i=1;i<n;i++) {
			int maxlis=0;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					maxlis=Math.max(lis[j],maxlis);
				}
			}
			lis[i]=maxlis+1;
		}
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(max,lis[i]);
		}
		
		System.out.println(max);
		
	}

}
