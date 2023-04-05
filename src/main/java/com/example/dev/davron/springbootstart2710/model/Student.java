package com.example.dev.davron.springbootstart2710.model;

public class Student {
    private Long id;
    private String name;
    private String lastName;
    private String course;

    public Student() {
    }

    public Student(Long id, String name, String lastName, String course) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
