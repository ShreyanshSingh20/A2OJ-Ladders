//Horner(Ruffini's) Method to check the roots of a polynomial

package mathematics;
import java.util.*;
public class HornerMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input the degree of the polynomial
		int n=sc.nextInt();
		int arr[]=new int[n+1];//Array to store the coefficients of the polynomial
		for(int i=0;i<n+1;i++) {
			arr[i]=sc.nextInt();
		}
		int check=sc.nextInt();//then number we want to check if it is a root of polynomial
		int ans=arr[0]*check;
		for(int i=1;i<=n;i++) {
			ans=ans+arr[i];
			ans=ans*check;
		}
		
		if(ans==0) System.out.println("YES");
		else System.out.println("NO");
		

	}

}

//I/P==>
//5
//1 -8 -72 382 727 -2310
//2


//O/P==>YES




