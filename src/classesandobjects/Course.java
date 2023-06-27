/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Course {

private String course_name, department;
private String course_code;
Scanner s = new Scanner(System.in);

Course()
{
System.out.println("Enter course name: ");
course_name= s.next();

System.out.println("Enter department name: ");
department= s.next();

System.out.println("Enter course code: ");
course_code = s.next();

while(course_code.length() == 7)
{
System.out.println("INVALID LENGTH! Please Re-enter ");
course_code= s.next();

}


}
    public void Display_Course()
{
System.out.println("Course name: " +  course_name + "Course code: " + course_name + "Department: " + department);
}

}
