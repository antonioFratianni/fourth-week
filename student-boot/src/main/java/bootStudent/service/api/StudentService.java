package bootStudent.service.api;
import com.mongodb.DBCollection;



import bootStudent.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll();

    Student create(Student student);

    Student save(Student student);

    Optional<Student> findById(String id);

    void update(DBCollection collection);
}
