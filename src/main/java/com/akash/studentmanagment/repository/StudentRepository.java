package com.akash.studentmanagment.repository;

import com.akash.studentmanagment.model.Student;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
