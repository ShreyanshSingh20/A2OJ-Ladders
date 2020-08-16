//A matrix representation whose  ith row gives us the binomial coefficients of (x+y)^i type binomial equation

package mathematics;
import java.util.*;
public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//binomial power
		int pt[][]=new int[n+1][n+1];
		
		//Constructing Pascal's Triangle for (x+y)^n
		
		for(int line=1;line<=n+1;line++) {
			int c=1;
			for(int i=1;i<=line;i++) {
				pt[line-1][i-1]=c;
				c=c*(line-i)/i;
			}
		}
		
		
		//Print Pascal's Triangle
//		for(int i=0;i<n+1;i++) {
//			for(int j=0;j<n+1;j++) {
//				System.out.print(pt[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//Generate Binomial coefficients for given n
		
		for(int i=0;i<n+1;i++) {
			System.out.print(pt[n][i]+" ");
		}

	}

}

//eg of pascal's triangle
// 1
//1  1
//1  2  1
//1  3  3  1
//1  4  6  4  1
//1  5  10  10  5  1
//1  6  15  20  15  6  1 
