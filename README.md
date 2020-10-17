# School_JavaClass201012

<h2>201012_HardWare：实验二 PC机模拟程序：</h2>

## 实验内容：

根据书P110与P111的第4题完成代码。

该题目分别需要创建以下三个class：

```
CPU类：
getSpeed()：返回speed值。
setSpeed(int m)：将参数m的值赋值给speed。
setSpeed(int):void
getSpeed():int
```

```
HardDisk类：
getAmount()：返回amount的值。
要求setAmount(int m)：将参数m的值赋值给amount。
amount:int
setAmount(int):void
getAmount():int
```

```
PC类：
setCPU(CPU c)：将参数c的值赋值给cpu。
setHardDisk(HardDisk h)：将参数h值赋值给HD。
show()：显示cpu的速度和硬盘的容量。
cpu:CPU
HD:HardDisk
setCPU(CPU):void
setHardDisk(HardDisk):void
show():void
```

```
Test类(主类)：
main方法{
创建CPU类对象cpu：speed值预设2200。
创建HardDisk对象disk：amount值预设200。
创建PC对象pc：调用setCPU(CPU c)、setHardDisk(HardDisk h)、show()方法。
}
```

---

## 实验方法：

编写Java程序，通过两个自定义包(m1与h1)来实现全部功能。

h1包内包含：HardWare.java：用来实现非主类相关操作。

m1包内包含：Test.java：用来实现主类相关操作。

---


## 实验结果：

成功完成正确输出。

---

## 实验感想：

用过很多语言写过程序，但因为自己认为类似Java语言比较臃肿繁琐还有虚拟架构性能问题和自我审查垃圾回收机制等觉得不够灵活所以一直并未接触Java。首次正式接触Java，更加渗透地感受到了面向对象的概念。


2020年10月16日

---
