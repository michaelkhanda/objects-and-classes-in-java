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
public class Testclass {

private int choice, users;
Scanner s = new Scanner(System.in);

public void Display_Testclass()
{
System.out.println("Do you want to create a: \n 1. Course \n 2. Instructor");
choice = s.nextInt();

System.out.println("How many do you want to enter?");
users = s.nextInt();

for(int i = 0; i < users; i++)
{
if (choice == 1)
{
Course c1 = new Course();
c1.Display_Course();
}
if(choice == 2)
{
Instructor i1 = new Instructor();
i1.Display_Instructor();
}
}
}

    
}
