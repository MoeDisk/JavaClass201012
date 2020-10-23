package experiment3;
import experiment3.Data_Operate;
import java.util.ArrayList;

public class Course {
	private String name;
	private int id;
	private Teacher teacher;
	private String room;
	private String time;
	private ArrayList<Student> students;

	public Course(int id, String name, String room, String time, Teacher teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		teacher.setCourse(this);
		this.time = time;
		this.room = room;
		this.students = new ArrayList<>();
	}

	public Course(String s, String 语文, String room, String 八点, Teacher t1) {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTime() {
		return time;
	}

	public void setcTime(String time) {
		this.time = time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean hasSpace() {
		return this.students.size() < 30;
	}

	public boolean hasStudent(Student stu) {
		return this.students.contains(stu);
	}

	public void addStudent(Student stu) {
		this.students.add(stu);
	}

	public void rmStudent(Student stu) {
		this.students.remove(stu);
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public String toString() {
		return "=====\n"
				+ "课程名：" + getName() + "\n"
				+ "课程号：" + getId() + "\n"
				+ "课程人数：" + students.size() + "\n"
				+ "课程地点：" + getRoom() + "\n"
				+ "课程时间：" + getTime() + "\n"
				+ "课程教师：" + getTeacher().getName() + "\n\n";
	}
}