
public class Course {
	
	public  Course() {
		System.out.println("Courses listed");
	}
	
	public Course(int id, String name, String detail, int videdoCount) {
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.videoCount=videdoCount;
	}
	
	int id;
	String name;
	String detail;
	int videoCount;

}

