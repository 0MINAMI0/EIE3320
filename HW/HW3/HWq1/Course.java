import java.util.*;
public class Course
{
    String courseName;
    int testMarks;
    public Course(String name, int result){
        courseName = name;
        testMarks = result;
    }
    
    public String[] toString(){
        String[] info = new String[2];
        String result=String.valueOf(testMarks);
        info[0] = courseName;
        info[1] = result;
        return info;
    }
}

