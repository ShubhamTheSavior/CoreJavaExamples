package Comparable;

public class Student {

	private int id;
	private long marks;
	
	public Student(int id, long marks) {
		super();
		this.id = id;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}
	
	
}
