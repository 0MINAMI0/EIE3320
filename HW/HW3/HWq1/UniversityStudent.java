public class UniversityStudent
{
    String studentName;
    int courseNumber;
    String[] courseList = new String[10];
    public UniversityStudent(String name, int number, String[] list){
        name = studentName;
        number = courseNumber;
        list = courseList;
    }
    public void print(){
        System.out.println();
    }
    public static void main(String[] args){
        Course stu1 = new Course("John", 100);
        System.out.print(stu1.toString());
        
    }
}
