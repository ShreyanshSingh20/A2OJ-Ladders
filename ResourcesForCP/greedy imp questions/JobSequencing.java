//Time Complexity~~O(nlogn)

package greedy;
import java.util.*;

class Job{
	int deadline;
	int profit;
	public Job(int deadline, int profit) {
		super();
		this.deadline = deadline;
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "Job [deadline=" + deadline + ", profit=" + profit + "]";
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	
}



public class JobSequencing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Job> a=new ArrayList<Job>();
		int maxd=0;
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			maxd=Math.max(maxd,d);
			int p=sc.nextInt();
			a.add(new Job(d,p));
		}
		
		int arr[]=new int[maxd];
		
		Collections.sort(a,new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				return o2.profit-o1.profit;
			}
			
		});
		
		a.forEach(System.out::println);
		int time=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			if(time<a.get(i).deadline&&arr[a.get(i).deadline-1]==0) {
				ans+=a.get(i).profit;
				arr[a.get(i).deadline-1]=a.get(i).profit;
			}
		}
		
		System.out.println(ans);
	}

}
