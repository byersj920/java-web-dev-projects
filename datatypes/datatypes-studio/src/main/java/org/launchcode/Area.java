package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        double radius;
        double area;

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        while (radius < 0){
            System.out.println("Radius can't be negative. Please enter a POSITIVE radius: ");
            radius = input.nextDouble();
        }
        input.close();
        area = (Circle.getArea(radius));
        System.out.println("The area of a circle with radius "+radius+" is: "+area);
    }
}
