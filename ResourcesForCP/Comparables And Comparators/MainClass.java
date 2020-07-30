package comparable;
import java.util.*;
public class MainClass {
	

	public static void main(String[] args) {
		List<Student> s=new ArrayList<Student>();
		
		s.add(new Student(23,"Kohli"));
		s.add(new Student(67,"Shreyansh"));
		s.add(new Student(12,"Pandu"));
		s.add(new Student(56,"Misra"));
		s.add(new Student(67,"Arjun"));
		
//		Collections.sort(s);//for comparable
//		Collections.sort(s,new sortByMarksAndThenByName());
		
//		Collections.sort(s,new Comparator<Student>(){
//		@Override
//			public int compare(Student obj1, Student obj2) {
//				if(obj1.marks-obj2.marks==0) return obj1.name.compareTo(obj2.name);
//				else return obj1.marks-obj2.marks;
//			}
//		});
		
		Collections.sort(s,(o1,o2)->o1.name.compareTo(o2.name));//new lamda feature
		
		s.forEach(System.out::println);

	}
	
	 

}

//class sortByMarksAndThenByName implements Comparator<Student>{
//
//	@Override
//	public int compare(Student obj1, Student obj2) {
//		if(obj1.marks-obj2.marks==0) return obj1.name.compareTo(obj2.name);
//		else return obj1.marks-obj2.marks;
//	}
//	
//}
