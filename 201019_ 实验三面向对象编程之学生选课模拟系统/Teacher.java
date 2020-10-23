package experiment3;
import experiment3.Data_Operate;

public class Teacher extends Data_Make {
	public Teacher(String id, String name, String gender) {
		super(id, name, gender);
	}

    private Course course;

	public Course getCourse() {
		return course;
	}

	private String getCourseName() { return course.getName(); }

	public void setCourse(Course course) {
		this.course = course;
	}

    public String toString() {
		return "=====\n"
				+ "教师姓名："+getName()+"\n"
				+ "教师学号："+getId()+"\n"
				+ "教师性别："+getGender()+"\n"
				+ "教师课程："+getCourseName();
	}
}