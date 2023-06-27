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
public class Instructor {
private String i_name;
private String i_number;

Scanner s = new Scanner(System.in);

Instructor()
{
System.out.println("Enter instructor's name: ");
i_name= s.next();

System.out.println("Enter course code: ");
i_number= s.next();
while(i_number.length() == 7)
{
System.out.println("INVALID LENGTH! KINDLY RE-ENTER");
i_number = s.next();
}

}
public void Display_Instructor()
{
System.out.println("Instructor name: " + " " + i_name + "\n Course code: " +" " + i_number);
}
    
}


