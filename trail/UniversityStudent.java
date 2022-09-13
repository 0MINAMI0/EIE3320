import  java.util.Arrays;
public class UniversityStudent
{
    String studentName;
    int courseNumber;
    Course[] courseList = new Course[10];
    public UniversityStudent(String name, int number, Course[] list){
        studentName = name;
        courseNumber = number;
        for (int i = 0; i < number; i++) {
            courseList[i] = list[i];
            System.out.println(courseList[i]);
        };        
    }
    public void print(){
        System.out.println("Student Name: " + studentName);

    }
}
