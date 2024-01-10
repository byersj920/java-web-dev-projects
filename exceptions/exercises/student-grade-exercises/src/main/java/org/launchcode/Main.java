package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(7,3);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.jerva");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> student: studentFiles.entrySet()){
            if (CheckFileExtension(student.getValue())==1){
                System.out.printf("%s's is correct. They earn 1 point.%n", student.getKey());
            } else if(CheckFileExtension(student.getValue())==0){
                System.out.printf("%s's is incorrect. They earn 0 points.%n", student.getKey());
            }
        }
    }

    public static void Divide(int x, int y)
    {
        if (y == 0){
            try{
                throw new RuntimeException("You can't divide by zero, buddy.");
            } catch(RuntimeException e){
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName)
    {
       if(fileName.isEmpty()){
           try{
               throw new RuntimeException("No file to read. Nothing submitted, you lose 1 point. :(");
           } catch(RuntimeException e){
               System.out.println("Error! No file submitted.");
               return -1;}}
       else if (fileName.endsWith(".java")){return 1;}
       else{return 0;}
        };

}