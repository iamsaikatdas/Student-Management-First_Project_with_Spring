package com.avengers.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1 - second work.
// ############################################################################### //
// get the information to the user there are three type: -
        // 1. Request Parameter - @GetMapping("/get_student")
            //localhost:8080/get_student?admnNo=1234
            // public Student getStudent(@RequestParam("admnNo") int admnNo){
            //       return db.get(admnNo);
            //  }

        // 1.1 Multiple Request Parameter - @GetMapping("/get_student")
            //localhost:8080/get_student?admnNo=1234&name="Saikat"
            // public Student getStudent(@RequestParam("admnNo") int admnNo, @RequestParam("name"), String name){
            //       return db.get(admnNo);
            //  }

        // 2. Path Parameter - @GetMapping("/get_student/{admnNo}")
            //localhost:8080/get_student/12345
            // public Student getStudent(@PathVariable("admnNo") int admnNo){
            //       return db.get(admnNo);
            //  }

        // 3. Request Body Parameter -

// ############################################################################### //

// @RestController - ata lekhar mane compiler bola je haa ata amar rest api.
@RestController
public class StudentController {


    // get the student details
    // GetMapping is a annotation, because get the student details is a get request
        // that why is a GetMapping, with get path "/get_student
    // @RequestParam is annotation, is the way to get admnNo path

    @Autowired
    StudentService studentService;
    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("admnNo") int admnNo){
        // return studentService.getStudent(admnNo);
        // return new ResponseEntity<>(studentService.getStudent(admnNo), HttpStatus.FOUND);
        Student response = studentService.getStudent(admnNo);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
     // get details with name
//    @GetMapping("/get_student/{name}")
//    public Student getStudent(@PathVariable("name") String name){
//        return db.va();
//    }

    // adding the data of student
    // postmapping is a annotation, because add student is a post request
        // that why is a postmapping, with path "/add_student
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response =  studentService.addStudent(student);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete_student/{admnNo}")
    public ResponseEntity deleteStudent(@PathVariable("admnNo") int admnNo){
        String response = studentService.deleteStudent(admnNo);
        if (response.equals("Invalid id")){
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("admnNo") int admnNo, @RequestBody Student student){
        String response =  studentService.updateStudent(admnNo, student);
        if (!response.equals(null)){
            return new ResponseEntity<>(response, HttpStatus.FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
