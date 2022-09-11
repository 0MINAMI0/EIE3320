public class UniversityStudent
{
    String studentName;
    int courseNumber;
    Course[] courseList = new Course[10];
    public UniversityStudent(String name, int number, Course[] list){
        studentName = name;
        courseNumber = number;
        courseList = list;
    }
    public void print(){
        /*System.out.println(studentName);
        System.out.println(courseNumber);
        System.out.println(courseList);*/
        Course student_t = new Course(studentName,courseNumber);
        System.out.println(student_t.toString() + " Course list is: " + courseList);
    }
}
