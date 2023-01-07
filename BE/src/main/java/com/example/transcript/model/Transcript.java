package com.example.transcript.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tranId;
    private int studentId;
    private String year;
    private Double GPA;

    /**
     * @return int return the tranId
     */
    public int getTranId() {
        return tranId;
    }

    /**
     * @param tranId the tranId to set
     */
    public void setTranId(int tranId) {
        this.tranId = tranId;
    }

    /**
     * @return int return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return String return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return Double return the GPA
     */
    public Double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

}