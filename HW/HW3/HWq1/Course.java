import java.util.*;
public class Course
{
    String courseName;
    int testMarks;
    public Course(String name, int result){
        courseName = name;
        testMarks = result;
    }

    public String toString(){
        return (courseName + ", " + testMarks);
    }}

