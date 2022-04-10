package com.java.app.studs;

import java.util.Objects;

public final class  CorrespondenceStudent extends Student {
    private String placeWork;
    private String position;
    private int amountTraining;

    public CorrespondenceStudent(String placeWork) {
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String placeWork) {
        super(iin);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String placeWork) {
        super(iin, name);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String placeWork) {
        super(iin, name, surname);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String patronymic, String placeWork) {
        super(iin, name, surname, patronymic);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String patronymic, String group, String placeWork) {
        super(iin, name, surname, patronymic, group);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String patronymic, String group, String department, String placeWork) {
        super(iin, name, surname, patronymic, group, department);
        this.placeWork = placeWork;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String patronymic, String group, String department, String placeWork, String position) {
        super(iin, name, surname, patronymic, group, department);
        this.placeWork = placeWork;
        this.position = position;
    }

    public CorrespondenceStudent(String iin, String name, String surname, String patronymic, String group, String department, String placeWork, String position, int amountTraining) {
        super(iin, name, surname, patronymic, group, department);
        this.placeWork = placeWork;
        this.position = position;
        this.amountTraining = amountTraining;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public int getAmountTraining() {
        return amountTraining;
    }

    public void setAmountTraining(int amountTraining) {
        this.amountTraining = amountTraining;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CorrespondenceStudent that = (CorrespondenceStudent) o;
        return Objects.equals(placeWork, that.placeWork) && Objects.equals(position, that.position) && Objects.equals(amountTraining, that.amountTraining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), placeWork, position, amountTraining);
    }

    @Override
    public String toString() {
        return "CorrespondenceStudent{" +
                "placeWork='" + placeWork + '\'' +
                ", position='" + position + '\'' +
                ", amountTraining='" + amountTraining + '\'' +
                '}';
    }
}
