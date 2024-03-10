package org.march.demo.repository;

import org.march.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    Optional<School> findByName(String name);

    @Query("select studentsCount from School where id = :id")
    int getStudentsCount(Long id);
}
