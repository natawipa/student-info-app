package com.example.student.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transcript {
    private int tranId;
    private int studentId;
    private String year;
    private double GPA;

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
     * @return double return the GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
