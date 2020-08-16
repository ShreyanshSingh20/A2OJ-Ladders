//For any integer m, the sequence of fibonacci numbers taken modulo m is periodic.
//This length of repeating sequence is called the Pisano period 

package mathematics;
import java.util.*;
public class PisanoPeriod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//first n fibonacci numbers
		int m=sc.nextInt();
		ArrayList<Integer> fib=new ArrayList<Integer>();
		ArrayList<Integer> afterModulo=new ArrayList<Integer>();
		fib.add(0,0);
		fib.add(1,1);
		int i=2;
		while(i<n) {
			int add=fib.get(i-1)+fib.get(i-2);
			fib.add(add);
			i++;
		}
		
		for(int x:fib) {
			afterModulo.add(x%m);
		}
		
		for(int y:afterModulo) {
			System.out.print(y+" ");
		}
		System.out.println();
		
		int prev=2;
		int curr=3;
		
		int period=2;//minumum period length is atleast 2
		while(true) {
			if(afterModulo.get(prev)==0&&afterModulo.get(curr)==1) break;
			else {
				prev++;
				curr++;
				period++;
			}
		}
		
		System.out.println("period is "+period);
		
		
		

	}

}

//input==>10 2
//output==>0 1 1 0 1 1 0 1 1 0 
//         period is 3
