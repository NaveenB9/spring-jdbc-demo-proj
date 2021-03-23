package com.naveen.spring;

public class StudentClass {

    private int id;
    private String first_name;
    private String last_name;
    private int marks;
    private String tecnology;

    public StudentClass(){};

    public StudentClass(int id, String first_name, String last_name, int marks, String tecnology) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.marks = marks;
        this.tecnology = tecnology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getTecnology() {
        return tecnology;
    }

    public void setTecnology(String tecnology) {
        this.tecnology = tecnology;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", marks=" + marks +
                ", tecnology='" + tecnology + '\'' +
                '}';
    }
}
