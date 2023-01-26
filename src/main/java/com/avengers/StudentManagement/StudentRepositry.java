package com.avengers.StudentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

 // 3. third work.
@Repository
public class StudentRepositry {

    // jkhn db diye kaj korbo, takhn map er jaigai db link korar line thakbe.
    Map<Integer, Student> db = new HashMap<>();

    // eakhne sudu db related logic e thakbe, jemon student details update, delete, add, get all details like that.

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        if (student == null)
            return "Invalid student details: addStudent function";

        int admnNo = student.getAdmissionNo();
        db.put(admnNo, student);
        return "Student details added sucessfully";
    }

    public String deleteStudent(int id){
        if (!db.containsKey(id))
            return "This admission no. not our database, delete student.";

        db.remove(id);
        return "Student details deleted sucessfully.";

    }

    public String updateStudent(int admnNo, Student student){
        if (!db.containsKey(admnNo))
            return "Invalid id, Please do with correct id.";

         db.get(admnNo).setAddress(student.getAddress());
         db.get(admnNo).setAge(student.getAge());
         db.get(admnNo).setName(student.getName());
         db.get(admnNo).setClassName(student.getClassName());

        return "Student details update sucessfully.";
    }

}
