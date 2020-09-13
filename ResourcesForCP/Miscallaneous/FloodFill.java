package special;
import java.util.*;
public class FloodFill {

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
		int r=sc.nextInt();
		int c=sc.nextInt();
		int toFill=sc.nextInt();
		int prevFill=mat[r][c];
		
		floodfill(mat,r,c,toFill,prevFill,n,m);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void floodfill(int mat[][],int r,int c,int toFill,int prevFill,int n,int m) {
		if(r<0||r>=n||c<0||c>=m) return;
		if(mat[r][c]!=prevFill) return;
		
		mat[r][c]=toFill;
		floodfill(mat,r+1,c,toFill,prevFill,n,m);
		floodfill(mat,r-1,c,toFill,prevFill,n,m);
		floodfill(mat,r,c+1,toFill,prevFill,n,m);
		floodfill(mat,r,c-1,toFill,prevFill,n,m);
	}

}
