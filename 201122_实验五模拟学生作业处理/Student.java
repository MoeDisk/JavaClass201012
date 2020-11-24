package five;

public class Student {
    private String name;
    private int age;
    private char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Student interactiveCreate() {
        return new Student(
                InputUtil.inputString("姓名?："),
                InputUtil.inputInt("年龄?：", 0, -1),
                InputUtil.select("性别?：", "Male", "Female").charAt(0)
        );
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "学生{\n" +
                "\t姓名='" + name + '\'' + "\n" +
                "\t年龄=" + age + "\n" +
                "\t性别=" + gender + "\n" +
                '}';
    }
}
