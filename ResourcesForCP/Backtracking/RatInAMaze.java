package backtracking;
import java.util.*;
public class RatInAMaze {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		int sol[][]=new int[m][n];
		
		if(mazerec(mat,0,0,sol,n,m)==true) {
			System.out.println("YES");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(sol[i][j]);
				}
				System.out.println();
			}
		}else {
			System.out.println("NO");
		}
		

	}
	
	static boolean mazerec(int mat[][],int i,int j,int sol[][],int n,int m) {
		if(i==n-1&&j==m-1) {
			sol[i][j]=1;
			return true;
		}
		
		if(isSafe(i,j,mat,n,m)==true) {
			sol[i][j]=1;
			if(mazerec(mat,i+1,j,sol,n,m)==true) return true;
			else if(mazerec(mat,i,j+1,sol,n,m)==true) return true;
			sol[i][j]=0;
		}
		return false;
	}
	
	
	static boolean isSafe(int i,int j,int mat[][],int n,int m) {
		if(i<n&&j<m&&mat[i][j]==1) return true;
		else return false;
	}

}
