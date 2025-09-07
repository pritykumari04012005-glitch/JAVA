// Design a Course class.
// Instance variable: courseName,enrolledStudents.
// static variable : maxCapacity, the maximum number of students for any course.
// Instance methods : enrollStudents(String studentName),
// unenrollStudent(String studentName).
//static method : setMaxCapacity(int capacity),to set the maximum capacity  for courses.




public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;


    String[] enrolledStudents;
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudent(String student){
        System.out.println("Student removed");
        enrollments--;
    }
}




















