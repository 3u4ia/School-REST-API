package com.example.hw1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Let's spring know that this variable is the ID/Primary Key.
@Table
public class Student {
    @Id // Let's spring know that this variable is the ID / Primary key
    @GeneratedValue // Lets spring know the value needs to be generated
    private Long id;
    private String name;
    private String major;
    private Integer year;

    public Student(){
    }

    public Student(Long id, String name, String major, Integer year){
        this.id = id;
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public Student(String name, String major, Integer year) {
        this.name = name;
        this.major = major;
        this.year = year;
    }

    /*The getters and setters are automatically used by idk maybe the */
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
