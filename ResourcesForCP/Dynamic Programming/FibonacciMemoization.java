package dynamicprogramming;
import java.util.*;
public class FibonacciMemoization {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		Arrays.fill(arr,-1);
		System.out.println(fib(arr,n));

	}
	
	
	static int fib(int arr[],int n) {
		if(arr[n]==-1) {
			int res=-1;
			if(n==0||n==1) res=n;
			else res=fib(arr,n-1)+fib(arr,n-2);
			arr[n]=res;
		}
		return arr[n];
	}

}
