package greedy;
import java.util.*;

class Pair{
	int start;
    int  end;
	public Pair(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	public String toString() {
		return "Pair [start=" + start + ", end=" + end + "]";
	}


	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	
	
	
	
	
}
public class ActivitySelection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Pair> a=new ArrayList<Pair>(n);
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			int e=sc.nextInt();
			a.add(new Pair(s,e));
		}
		
		Collections.sort(a,new Comparator<Pair>(){

			@Override
			public int compare(Pair o1, Pair o2) {
				return (o1.start-o2.start);
			}
			
		});
		
		a.forEach(System.out::println);
		int ans=1;
		int last=a.get(0).end;
		for(int i=1;i<n;i++) {
			if(a.get(i).start<=last) {
				ans++;
				last=a.get(i).end;
			}
		}
		
		System.out.println(ans);
		

	}

}
