package com.java.designpattern.pattern3_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Teacher implements Cloneable {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", student=" + student + "]";
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        //浅克隆
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //深克隆
        Teacher teacher = (Teacher) super.clone();
        teacher.setStudent((Student) teacher.getStudent().clone());
        return teacher;
    }

    //深克隆
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}