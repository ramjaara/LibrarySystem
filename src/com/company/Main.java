package com.company;
//main method could be broken down into other methods
//myObj is not really a good variable name good use of try catch
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean Finished = false;
        while (!Finished) {
            String BookTitle = getinput("Enter the book title");
            int ISBN_Number = Integer.parseInt(getinput("Enter the book ISBN number"));
            String BookAuthor = getinput("Enter the book Author");
            String BookGenre = getinput("Enter the book Genre");
            String UserFinished = getinput("Are you finished Y/N");
            if(UserFinished.equals("Y")){
                Finished = true;
            }
        }
    }

    public static String getinput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }

    public static void CreateFile() {
        try {
            File myObj = null;
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WriteFile(){

    }


}
