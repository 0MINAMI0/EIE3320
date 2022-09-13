import java.util.*;
public class Course
{
    String courseName;//name of course
    int testMarks;//result of the course
    
    //get course name and result
    public Course(String name, int result){
        courseName = name;
        testMarks = result;
    }

    //return string with name and result of course
    public String toString(){
        return (courseName + ", " + testMarks);
    }}

