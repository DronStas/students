package com.java.app.studs;

import java.util.Objects;

public class FullTimeStudent extends Student{
    private short ent;
    private byte gradePointAverage;


    public FullTimeStudent(short ent, byte gradePointAverage) {
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, short ent, byte gradePointAverage) {
        super(iin);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, String name, short ent, byte gradePointAverage) {
        super(iin, name);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, String name, String surname, short ent, byte gradePointAverage) {
        super(iin, name, surname);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, String name, String surname, String patronymic, short ent, byte gradePointAverage) {
        super(iin, name, surname, patronymic);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, String name, String surname, String patronymic, String group, short ent, byte gradePointAverage) {
        super(iin, name, surname, patronymic, group);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public FullTimeStudent(String iin, String name, String surname, String patronymic, String group, String department, short ent, byte gradePointAverage) {
        super(iin, name, surname, patronymic, group, department);
        this.ent = ent;
        this.gradePointAverage = gradePointAverage;
    }

    public short getEnt() {
        return ent;
    }

    public void setEnt(short ent) throws Exception {
        if(ent>140)
            throw new Exception("ent>140");
        if(ent<0)
            throw new Exception("ent<0");
        else
          this.ent =  ent;
    }

    public byte getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(byte gradePointAverage) throws Exception{
        if(gradePointAverage>5)
            throw new Exception("gradePointAverage>5");
        if(gradePointAverage<0)
            throw new Exception("gradePointAverage<0");
        else
            this.gradePointAverage = gradePointAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FullTimeStudent that = (FullTimeStudent) o;
        return ent == that.ent && gradePointAverage == that.gradePointAverage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ent, gradePointAverage);
    }

    @Override
    public String toString() {
        return "FullTimeStudent{" +
                "ent=" + ent +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }
}
