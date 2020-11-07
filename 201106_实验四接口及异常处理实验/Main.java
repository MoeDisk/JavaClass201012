package P4;

public class Main {
    public static void main(String[] args) {
        float feePerTerm = 2300;
        float salaryPerMonth = 4000;
        Doctor[] stu = new Doctor[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("==Go！/==");
            stu[i] = new Doctor(
                    Tools.inputString("学生姓名:"),
                    Tools.select("学生性别", new String[]{"男", "女"}),
                    Tools.inputInt("学生年龄", 0, 100),
                    feePerTerm, salaryPerMonth
            );
        }
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < 2; j++) {
                stu[i].purchaseTuition();
            }
            for (int j = 0; j < 12; j++) {
                stu[i].getSalary();
            }
            stu[i].statistics();
            System.out.println();
        }
    }
}
