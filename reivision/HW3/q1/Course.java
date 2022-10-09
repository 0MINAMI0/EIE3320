
public class Course
{
    String courseName;
    int testMarks;
    
    Course(String name, int marks){
        courseName = name;
        testMarks = marks;
    }
    
    public String toString(){
        return courseName+", "+testMarks;
    }
}

