package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Рыжундр Мурзикович Котовский");
        student.setGroup(15);
        student.setDateOfReceipt(new Date());
        System.out.println("Студент: " + student.getFullName() + "; Группа № " + student.getGroup() + "; Дата поступления: " + student.getDateOfReceipt());
    }
}
