package bootStudent.controller;


import bootStudent.domain.Student;
import bootStudent.service.api.StudentService;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/student")
    ResponseEntity <List<Student>> getAll(){
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping(path="/student")
    ResponseEntity<Student> create(@RequestBody Student student){
        Student student1 = studentService.create(student);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    ResponseEntity<Student> save(@RequestBody Student student){
        Student student2 = studentService.save(student);
        return new ResponseEntity<>(student2, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id) throws UnknownHostException {
        String studentid = id;

        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("corso");
        DBCollection dbCollection = db.getCollection("student");

        studentService.update(dbCollection);

        return ResponseEntity.ok(HttpStatus.OK);
    }

}
