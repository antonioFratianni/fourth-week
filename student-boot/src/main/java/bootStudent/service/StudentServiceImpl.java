package bootStudent.service;


import bootStudent.domain.Student;
import bootStudent.repository.StudentRepository;
import bootStudent.service.api.StudentService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student create(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(String id) {
        return studentRepository.findById(id);

    }

    @Override
    public void update(DBCollection collection) {
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.append("$set", new BasicDBObject().append("name", "Pippo"));
        BasicDBObject searchQuery = new BasicDBObject().append("lastName","Pippo2");
        collection.update(searchQuery, dbObject);
    }

    @Override
    public Student save(Student student) {
            return studentRepository.save(student);

    }

}
