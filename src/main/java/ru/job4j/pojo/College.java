package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ryazantsev Sergey Nikolaevich");
        student.setGroup(1);
        student.setAdmission(new Date());

        System.out.println("Name: " + student.getFio() + ", group: "
                + student.getGroup() + ", Date of admission: " + student.getAdmission());
    }
}
