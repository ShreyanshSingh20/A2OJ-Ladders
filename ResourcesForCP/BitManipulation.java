package bits;
import java.util.*;
public class BitManipulation {

	public static void main(String[] args) {
		BitSet bs1=new BitSet();
		BitSet bs2=new BitSet();
		BitSet bs3=new BitSet();
		
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(3);
		
		bs2.set(0);
		bs2.set(1);
//		bs2.set(2);
		bs2.set(3);
		bs2.set(4);
		
		System.out.println("bs1-->"+bs1);
		System.out.println("bs2-->"+bs2);
		
		System.out.println("get on bs1-->"+bs1.get(1,4));
		
		bs1.and(bs2);
		System.out.println(bs1);
		
		System.out.println(bs1.equals(bs2));
		
		bs2.flip(0,3);
		System.out.println(bs2);
		
		System.out.println(bs1.intersects(bs2));
		
		System.out.println(bs1.isEmpty());
		
		bs3=(BitSet)bs1.clone();
		System.out.println("bs3-->"+bs3);
		
		System.out.println(bs1.cardinality());
		
		bs1.xor(bs2);
		System.out.println(bs1);
		
		System.out.println(bs2.length());

	}

}
