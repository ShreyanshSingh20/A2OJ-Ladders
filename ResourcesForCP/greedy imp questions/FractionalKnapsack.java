//Time complexity~~O(nlogn)

package greedy;
import java.util.*;

class fr{
	int weight;
	int points;
	public fr(int weight, int points) {
		super();
		this.weight = weight;
		this.points = points;
	}
	@Override
	public String toString() {
		return "fr [weight=" + weight + ", points=" + points + "]";
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}

public class FractionalKnapsack {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cap=sc.nextInt();
		ArrayList<fr> a=new ArrayList<fr>();
		for(int i=0;i<n;i++) {
			a.add(new fr(sc.nextInt(),sc.nextInt()));
		}
		
		Collections.sort(a,new Comparator<fr>() {

			@Override
			public int compare(fr o1, fr o2) {
				return ((o2.points/o2.weight)-(o1.points/o1.weight));
			}
			
		});
		
		a.forEach(System.out::println);
		
		int ans=0;
		
		for(int i=0;i<n;i++) {
			if(a.get(i).weight<=cap) {
				ans=ans+a.get(i).points;
				cap=cap-a.get(i).weight;
			}
			else {
				ans=ans+(cap*(a.get(i).points/a.get(i).weight));
				break;
			}
			
			
		}
		
		System.out.println(ans);
	

	}

}
