package com.botscrew.test.repositories;

import com.botscrew.test.models.Departament;
import com.botscrew.test.models.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long> {

    @Query(value = "select * from Departament where name = ?1"
    , nativeQuery = true)
    Departament findHeadDepartamentByName(String name);

    @Query(value = "select * from lector l inner join departament d on d.id = l.deg_id where d.name = ?1",
    nativeQuery = true)
    List<Lector> findDepartamentStatistic(String name);
}
