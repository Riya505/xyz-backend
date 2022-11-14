package com.nestdigital.xyzbackendnew.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    private String studentName;
    private int rollNo;
    private int admissionNo;
    private String collegeName;
    private String department;
    private String bloodGroup;
    private String dateOfBirth;
    private String parentName;
    private String parentEmail;
    private String guardianName;
    private String guardianAddress;

    public StudentModel() {
    }

    public StudentModel(int id, String studentName, int rollNo, int admissionNo, String collegeName, String department, String bloodGroup, String dateOfBirth, String parentName, String parentEmail, String guardianName, String guardianAddress) {
        this.id = id;
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.admissionNo = admissionNo;
        this.collegeName = collegeName;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.dateOfBirth = dateOfBirth;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.guardianName = guardianName;
        this.guardianAddress = guardianAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }
}
