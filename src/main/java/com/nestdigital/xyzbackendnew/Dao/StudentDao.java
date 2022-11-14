package com.nestdigital.xyzbackendnew.Dao;

import com.nestdigital.xyzbackendnew.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `student` WHERE `id` =:id",nativeQuery = true)
    void deleteStudentById(Integer id);

    @Query(value = "SELECT * FROM `student` WHERE `student_name`=:student_name OR `admission_no`=:admission_no",nativeQuery = true)

    List<StudentModel> searchStudent(String student_name,Integer admission_no);

}
