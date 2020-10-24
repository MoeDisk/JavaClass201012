# 201019_ 实验三面向对象编程之学生选课模拟系统

## 实验目的

熟悉Java中继承与Object中toString()的用法。

## 实验要求

这是一个选课系统。
类有：教师、学生、课程、信息组成、信息操作。
学生来选课，老师来任课。学生和老师都只能选任一门课。支持增加和删除课。教师和学生继承一些共同的属性。

## 实验流程

<img src="https://raw.githubusercontent.com/MoeDisk/JavaClass201012/main/201019_%20%E5%AE%9E%E9%AA%8C%E4%B8%89%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%E4%B9%8B%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E6%A8%A1%E6%8B%9F%E7%B3%BB%E7%BB%9F/chart.jpg">

流程图链接：https://github.com/MoeDisk/JavaClass201012/blob/main/201019_%20%E5%AE%9E%E9%AA%8C%E4%B8%89%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%E4%B9%8B%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E6%A8%A1%E6%8B%9F%E7%B3%BB%E7%BB%9F/chart.jpg

Data_Make.java：来存一些教师和同学的一些通用属性(如姓名等)再继承给Teacher和Student。

Data_Operate.java：来存一些教师和学生的信息，还有增加删除功能。

Course.java：来存一些课程的属性。

## 实验精髓

```
==继承==
public class Data_Make {
    private String id;
    private String name;
    private String gender;

public class Teacher extends Data_Make {
	public Teacher(String id, String name, String gender) {
		super(id, name, gender);
	}

public class Student extends Data_Make {
        public Student(String id, String name, String gender){
            super(id,name,gender);
        }
```

```
==toString()==
public String toString(){
            return "=====\n"
                    +"学生ID："+getId()+"\n"
                    +"学生姓名："+getName()+"\n"
                    +"学生性别："+getGender()+"\n"
                    +"学生课程："+getCourseName();
        }
```

## 实验结果

成功完成正确输出。

## 实验感想

我觉得这次实验锻炼了我的Java编程能力。虽然我不喜欢Java语言，但它总能给我带来一些新的思考。
