package com.botscrew.test.repositories;

import com.botscrew.test.models.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {

    @Query(value = "select * from Lector l where l.name like %?1%",
    nativeQuery = true)
    List<Lector> findLectorByName(String name);


    @Query(value = "select * from Lector l inner join Departament d on l.dep_id=d.id where d.name=?1 ",
    nativeQuery = true)
    List<Lector> findAvgSalaryLectorByDepartament(String name);

    @Query(value = "select * from Lector l inner join Departament d on l.dep_id=d.id where d.name=?1 ",
            nativeQuery = true)
    List<Lector> findCountOfLectors(String name);

}
