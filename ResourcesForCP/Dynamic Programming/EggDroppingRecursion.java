package dynamicprogramming;
import java.util.*;
public class EggDroppingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
		int f=sc.nextInt();
		System.out.println(trials(e,f));
	}
	
	
	static int  trials(int e,int f){
		if(f==0||f==1) return f;
		if(e==0) return 0;
		if(e==1) return f;
		
		int m=Integer.MAX_VALUE;
		int res=0;
		for(int x=1;x<=f;x++) {
			res=Math.max(trials(e-1,x-1),trials(e,f-x));
			if(res<m) m=res;
		}
		
		return m+1;
	}

}
