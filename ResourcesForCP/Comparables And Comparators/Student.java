package comparable;
import java.util.*;
public  class Student implements Comparable<Student> {

	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
	public int compareTo(Student obj) {
//		if(this.name.compareTo(obj.name)>0) return 1;
//		else if(this.name.compareTo(obj.name)<0) return -1;
//		else return 0;
		
		return this.name.compareTo(obj.name);
	}
	
	
	
	

}
