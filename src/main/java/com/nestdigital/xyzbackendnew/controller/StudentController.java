package com.nestdigital.xyzbackendnew.controller;

import com.nestdigital.xyzbackendnew.Dao.StudentDao;
import com.nestdigital.xyzbackendnew.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/studentEntry",consumes = "application/json",produces = "application/json")
    public String studentEntry(@RequestBody StudentModel studentModel){
        System.out.println(studentModel.toString());
        dao.save(studentModel);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewStudents")
    public List<StudentModel>viewStudent(){
        return (List<StudentModel>)dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping("/deletestudent")
    public String deletestudent(@RequestBody StudentModel studentModel){
        dao.deleteStudentById(studentModel.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchStudent",consumes = "application/json",produces = "application/json")
    public List<StudentModel> searchStudent(@RequestBody StudentModel studentModel){
        return (List<StudentModel>) dao.searchStudent(studentModel.getStudentName(),studentModel.getAdmissionNo());

    }


}
