//Theorem states that any natural number can be represented as sum of one or more 
//distinct fibonacci numbers such that the sum does not include any consecutive 
//fibonacci numbers

package mathematics;
import java.util.*;
public class ZeckendorfTheorem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> fib=new ArrayList<Integer>();
		fib.add(0,0);
		fib.add(1,1);
		int i=2;
		while(true) {
			fib.add(i,fib.get(i-1)+fib.get(i-2));
			if(fib.get(i)>=n) break;
			else i++;
		}
		
		
		
		int last=fib.size()-1;
		while(n>0) {
			if(fib.get(last)<=n) {
			System.out.print(fib.get(last)+" ");
			n=n-fib.get(last);
			}
			last--;
		}

	}

}

//IP==77
//OP==55+21+1
