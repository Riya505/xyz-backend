package com.nestdigital.xyzbackendnew.controller;

import com.nestdigital.xyzbackendnew.Dao.FacultyDao;
import com.nestdigital.xyzbackendnew.Model.FacultyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/facultyEntry",consumes = "application/json",produces = "application/json")
    public String facultyEntry(@RequestBody FacultyModel facultyModel){
        dao.save(facultyModel);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewFaculty")
    public List<FacultyModel> viewFaculty(){
        return (List<FacultyModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/deleteFaculty")
    public String deleteFaculty(@RequestBody FacultyModel facultyModel){
        dao.deleteById(facultyModel.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/searchFaculty",consumes = "application/json",produces = "application/json")
    public List<FacultyModel> searchFaculty(@RequestBody FacultyModel facultyModel){
        return (List<FacultyModel>) dao.SearchFacultyByName(facultyModel.getName());
    }
}
