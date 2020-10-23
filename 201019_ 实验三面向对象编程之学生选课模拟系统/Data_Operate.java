package experiment3;

public class Data_Operate{
    public static void main(){
        Student stu1=new Student("1","WangFei1","Male");
        Student stu2=new Student("2","WangFei2","Male");
        Student stu3=new Student("3","WangFei3","FeMale");
        Teacher t1=new Teacher("7","ZhangShiBo1","Male");
        Teacher t2=new Teacher("8","ZhangShiBo2","Male");
        Teacher t3=new Teacher("9","ZhangShiBo3","Male");
        Course c1=new Course("10","语文","100","八点",t1);
        Course c2=new Course("20","数学","200","九点",t2);
        Course c3=new Course("30","英语","300","十点",t3);

        addStu(stu2,c2);
        System.out.println(c2);
        removeStu(stu2,c2);
        System.out.println(c2);
    }

    public static void showStu(Course c){
        System.out.println("选这个课"+c.getName()+"的学生有：");
        for(Student s:c.getStudents()){
            System.out.print(s.getName());
        }System.out.println();
    }

    public static void addStu(Student stu,Course c) {
		stu.setCourse(c);
		c.addStudent(stu);
	}

	public static void removeStu(Student stu,Course c) {
		c.rmStudent(stu);
	}
}
