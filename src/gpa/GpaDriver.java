/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.util.Scanner;
/**
 *
 * @author Naveen Kumar, Chandaluri
 */
public class GpaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fName,lName, id, grade1,grade2,grade3;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Enter the First Name of the Student:");
        fName = stdIn.nextLine();
        System.out.println("Enter the Last Name of the Student:");
        lName = stdIn.nextLine();
        System.out.println("Enter the SId:");
        id = stdIn.nextLine();
        System.out.println("Enter the First Course grade:");
        grade1 = stdIn.next();
        System.out.println("Enter the Second Course grade:");
        grade2 = stdIn.next();
        System.out.println("Enter the Third Course grade:");
        grade3 = stdIn.next();
        
        Gpa gpa = new Gpa();
        gpa.setFirstName(fName);
        gpa.setLastName(lName);
        gpa.setsId(id);
        gpa.setCourse1(grade1);
        gpa.setCourse2(grade2);
        gpa.setCourse3(grade3);
        
        System.out.println("\n \n ************ Student Results **********");
        System.out.println("Student Name : "+gpa.getFirstName()+" "
                +gpa.getLastName());
        System.out.println("Student Id   : "+gpa.getsId());
        System.out.println("Course1 grade: "+gpa.getCourse1());
        System.out.println("Course2 grade: "+gpa.getCourse2());
        System.out.println("Course3 grade: "+gpa.getCourse3());
        System.out.printf("Total SGPA    :%.2f\n",
                gpa.calculateGpa(grade1, grade2, grade3));
    }
}
