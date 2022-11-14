package com.nestdigital.xyzbackendnew.Dao;

import com.nestdigital.xyzbackendnew.Model.FacultyModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyDao extends CrudRepository<FacultyModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `faculty` WHERE `id`=:id",nativeQuery = true)
    void deleteById(Integer id);

    @Query(value = "SELECT `id`, `address`, `department`, `designation`, `dob`, `doj`, `mobile`, `name`, `qualification` FROM `faculty` WHERE `name`=:name",nativeQuery = true)
    List<FacultyModel> SearchFacultyByName(String name);
}
