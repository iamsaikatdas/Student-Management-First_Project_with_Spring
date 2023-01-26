package com.avengers.StudentManagement;

import org.apache.catalina.users.SparseUserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    // 2. second work.
    @Autowired
    StudentRepositry studentRepositry;

    public Student getStudent(int id){
        return studentRepositry.getStudent(id);
    }

    public String addStudent(Student student){
        return studentRepositry.addStudent(student);
    }

    public String deleteStudent(int id){
       return studentRepositry.deleteStudent(id);
    }

    public String updateStudent(int id, Student student){
        return studentRepositry.updateStudent(id, student);
    }
}
