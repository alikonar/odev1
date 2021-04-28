
public class CourseManager {
	
	public CourseManager(Course course) {
		System.out.println("Course ID: "+course.id);
		System.out.println("Course Name: " +course.name);
		System.out.println("Course Detail: "+course.detail);
		System.out.println("Course Video Count: "+course.videoCount);
	}
	
	public void courseAdded(Course course) {
		System.out.println(course.name+" course added..");
	}
	
}
