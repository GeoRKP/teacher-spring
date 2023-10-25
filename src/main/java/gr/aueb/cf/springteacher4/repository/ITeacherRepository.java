package gr.aueb.cf.springteacher4.repository;

import gr.aueb.cf.springteacher4.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> getByLastnameStartingWith(String lastname);
    Teacher getById(Long id);


}
