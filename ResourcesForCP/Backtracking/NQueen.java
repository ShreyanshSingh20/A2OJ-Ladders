//Given n queens in an nxn chessboard. See if there's a way these queens can be placed in the chessboard
//without attacking each other.

package backtracking;
import java.util.*;
public class NQueen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int chess[][]=new int[n][n];
		
		if(recSol(chess,0,n)==true) {
			System.out.println("YES");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("NO");
		}

	}
	
	static boolean recSol(int chess[][],int col,int n) {
		if(col==n) {
			return true;
		}
		else {
			for(int i=0;i<n;i++) {
				if(isSafe(chess,i,col,n)==true) {
					chess[i][col]=1;
					if(recSol(chess,col+1,n)==true) return true;
					chess[i][col]=0;
				}
			}
		}
		
		return false;
	}
	
	static boolean isSafe(int chess[][],int row,int col,int n) {
		
		for(int i=col;i>=0;i--) {
			if(chess[row][i]==1) return false;
		}
		
		for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(chess[i][j]==1) return false;
		}
		
		for(int i=row,j=col;i<n&&j>=0;i++,j--) {
			if(chess[i][j]==1) return false;
		}
		
		return true;
		
	}

}
