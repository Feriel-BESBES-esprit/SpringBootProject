package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Course {
    @Id
    private Long idCourse;
    private String empiocement;
    private LocalDate dateCourse;

    public Course() {}
    public Course(String empiocement, LocalDate dateCourse) {
        this.empiocement = empiocement;
        this.dateCourse = dateCourse;
    }

    public LocalDate getDateCourse() {
        return dateCourse;
    }

    public void setDateCourse(LocalDate dateCourse) {
        this.dateCourse = dateCourse;
    }

    public String getEmpiocement() {
        return empiocement;
    }

    public void setEmpiocement(String empiocement) {
        this.empiocement = empiocement;
    }
}
