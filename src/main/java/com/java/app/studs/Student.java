package com.java.app.studs;

import java.util.Objects;

public abstract class Student {
    private String iin;
    private String name;
    private String surname ;
    private String patronymic ;
    private String group ;
    private String department ;

    public Student() {
    }

    public Student(String iin) {
        this.iin = iin;
    }

    public Student(String iin, String name) {
        this.iin = iin;
        this.name = name;
    }

    public Student(String iin, String name, String surname) {
        this.iin = iin;
        this.name = name;
        this.surname = surname;
    }

    public Student(String iin, String name, String surname, String patronymic) {
        this.iin = iin;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Student(String iin, String name, String surname, String patronymic, String group) {
        this.iin = iin;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.group = group;
    }

    public Student(String iin, String name, String surname, String patronymic, String group, String department) {
        this.iin = iin;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.group = group;
        this.department = department;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iin.equals(student.iin)
                && name.equals(student.name)
                && surname.equals(student.surname)
                && patronymic.equals(student.patronymic)
                && group.equals(student.group)
                && department.equals(student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iin, name, surname, patronymic, group, department);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iin='" + iin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", group='" + group + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
