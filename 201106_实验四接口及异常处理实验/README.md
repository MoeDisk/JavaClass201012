# 201106_实验四接口及异常处理实验

## 实验目的

掌握Java中抽象类和抽象方法的定义和接口的定义；

了解异常的使用方法，并在程序中根据输入情况做异常处理。

## 实验要求

在博士研究生类中实现各个接口定义的抽象方法;

对年学费和年收入进行统计，用收入减去学费，求得纳税额；

国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。

实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。

根据输入情况，要在程序中做异常处理。

## 实验精髓

```
教师接口定义：
public interface Teacher {
    void getSalary();
    float askSalary();
}
学生接口定义：
public interface Student {
    void purchaseTuition();
    float askTuition();
}
使用这些接口：
public class Doctor implements Student, Teacher
```

```
异常处理的使用：
try {
  finput = sc.nextFloat();
} catch (InputMismatchException e) {
  System.out.println("(TryCatch)只能数字！");
} catch (Exception ignored) {
}
```

## 实验结果

成功完成正确输出。


## 实验感想

Java相比起C++等繁琐不灵活但它什么都会先帮你考虑好，这样的思想适合中大型企业协作代码，异常处理就又印证了这一点。

我觉得这次实验锻炼了我的Java编程能力。虽然我不喜欢Java语言，但它总能给我带来一些新的思考。
