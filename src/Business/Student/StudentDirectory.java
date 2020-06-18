package Business.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDirectory {
    
    
    public ArrayList<Student> studentDirectory;
    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public StudentDirectory() {
       studentDirectory = new ArrayList<Student>();
    }

  
    public Student addStudent (){
        Student student=new Student();
        studentDirectory.add(student);
        return student;
    }

   
}
