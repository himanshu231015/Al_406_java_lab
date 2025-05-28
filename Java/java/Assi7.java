//program to find area and circumference of circle by taking radius as input from user

import java.util.Scanner;
public  class Assi7 {
    public static void main(String[] args){
        // Name n1 = new Name();                  //constructor for name and EN
        // n1.info();                             //Method calling
        Base.info();
        double radius,area,circumference;
        Scanner scr = new Scanner(System.in);
        System.out.print("enter radius of circle : ");
        radius = scr.nextFloat();
        circumference = 2*3.14*radius;
        area = 3.14*radius*radius;
        System.out.println("area of circle : " +area);
        System.out.println("circumference of circle : " +circumference);
        
    }
} 
