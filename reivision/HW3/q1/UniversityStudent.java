import java.util.*;
public class UniversityStudent
{
    String studentName;
    int courseNumber;
    Course[] courseList;

    UniversityStudent(String name, int number, Course[] list){
        studentName=name;
        courseNumber=number;
        courseList = list;
    }

    public void print(){
        System.out.println("Student Name: "+studentName);
        for(int i=0;i<courseNumber;i++){
            System.out.println(courseList[i].toString());
        }

    }
}
