package experiment3;
import experiment3.Data_Operate;

public class Student extends Data_Make {
        public Student(String id, String name, String gender){
            super(id,name,gender);
        }
        private Course course;
        public Course getCourse(){
            return course;
        }
        public String getCourseName(){ return course.getName(); }
        public void setCourse(Course course){ this.course=course; }

        public String toString(){
            return "=====\n"
                    +"学生ID："+getId()+"\n"
                    +"学生姓名："+getName()+"\n"
                    +"学生性别："+getGender()+"\n"
                    +"学生课程："+getCourseName();
        }
}