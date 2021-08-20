package com.sts.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
