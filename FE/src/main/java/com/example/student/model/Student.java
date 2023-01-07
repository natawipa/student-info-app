package com.example.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;  //primary key
    private String name;
    private String school;
    private String psw;
    

    public Student() {}
    
    public Student(int id, String name, String psw, String school) {
        this.id = id;
        this.name = name;
        this.psw = psw;
        this.school = school;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {

         
        this.name = name;
    }

    /**
     * @return String return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the name to set
     */
    public void setSchool(String school) {

         
        this.school = school;
    }

    /**
     * @return String return the psw
     */
    public String getPsw() {
        //decrypted
        return psw;
    }

    /**
     * @param psw the psw to set
     */
    public void setPsw(String psw) {
        // encrypted
        this.psw = psw;
    }
}
