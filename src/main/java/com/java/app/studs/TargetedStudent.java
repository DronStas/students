package com.java.app.studs;

import java.util.Objects;

public final class  TargetedStudent extends  Student{
    private String enterprises;
    private int amountTraining;

    public TargetedStudent(String enterprises) {
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String enterprises) {
        super(iin);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String name, String enterprises) {
        super(iin, name);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String name, String surname, String enterprises) {
        super(iin, name, surname);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String enterprises) {
        super(iin, name, surname, patronymic);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String group, String enterprises) {
        super(iin, name, surname, patronymic, group);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String group, String department, String enterprises) {
        super(iin, name, surname, patronymic, group, department);
        this.enterprises = enterprises;
    }

    public TargetedStudent(String enterprises, int amountTraining) {
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public String getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(String enterprises) {
        this.enterprises = enterprises;
    }



    public int getAmountTraining() {
        return amountTraining;
    }

    public void setAmountTraining(int amountTraining) {
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String enterprises, int amountTraining) {
        super(iin);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String name, String enterprises, int amountTraining) {
        super(iin, name);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String name, String surname, String enterprises, int amountTraining) {
        super(iin, name, surname);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String enterprises, int amountTraining) {
        super(iin, name, surname, patronymic);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String group, String enterprises, int amountTraining) {
        super(iin, name, surname, patronymic, group);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }

    public TargetedStudent(String iin, String name, String surname, String patronymic, String group, String department, String enterprises, int amountTraining) {
        super(iin, name, surname, patronymic, group, department);
        this.enterprises = enterprises;
        this.amountTraining = amountTraining;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TargetedStudent that = (TargetedStudent) o;
        return amountTraining == that.amountTraining && enterprises.equals(that.enterprises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enterprises, amountTraining);
    }

    @Override
    public String toString() {
        return "TargetedStudent{" +
                "enterprises='" + enterprises + '\'' +
                ", amountTraining=" + amountTraining +
                '}';
    }
}
