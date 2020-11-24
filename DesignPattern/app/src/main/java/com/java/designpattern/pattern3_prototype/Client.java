package com.java.designpattern.pattern3_prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(20,"张三");

        Teacher teacher1 = new Teacher();
        teacher1.setName("小赵老师");
        teacher1.setStudent(s1);
        //为什么会出现以下结果, Teacher中的clone方法
        Teacher teacher2 = (Teacher)teacher1.clone();
        teacher2.setName("小高老师");
        Student s2 = teacher2.getStudent();
        s2.setName("李四");
        s2.setAge(30);
        System.out.println("teacher1:"+teacher1);
        System.out.println("teacher2:"+teacher2);

    }
}