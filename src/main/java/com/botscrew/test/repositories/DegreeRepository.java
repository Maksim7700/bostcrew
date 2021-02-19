package com.botscrew.test.repositories;

import com.botscrew.test.models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DegreeRepository extends JpaRepository<Degree, Long> {


    @Query(value = "select count(*) from degree d inner join lector l on d.id = l.deg_id inner join departament t on t.id=l.dep_id where t.name = ?1",
    nativeQuery = true)
    List<Degree> findAllByDepartament(String name);

}
