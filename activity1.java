/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author User
 */
public class activity1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Enter your First Name:");
        String fname = scn.nextLine();
        
        System.out.println("Enter your Midle Name : ");
        String mName = scn.nextLine();
        
        System.out.println("last name ");
        String lName = scn.nextLine();
        
        System.out.println("Enter your age");
        String age = scn.nextLine();
        
        System.out.println("enter Gender");
        String gender = scn.nextLine();
        
        System.out.println("Enter birthdate");
        String bDate = scn.nextLine();
        
        
        
        System.out.println("first name"+ fname);
        System.out.println("middle name"+mName);
        System.out.println("last name"+lName);
        System.out.println("age"+age);
        System.out.println("Gender"+ gender);
        System.out.println("Birthdate"+bDate);
        
    }
}
