//mason 2/6 project 1

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<String> myList=new ArrayList<>();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>();
        System.out.println("type 1 to add a task");
        System.out.println("type 2 to remove a task");
        System.out.println("type 3 to update a task");
        System.out.println("type 4 to list all task");
        System.out.println("type 0 to exit");
        System.out.println("please make a selection");
        int userInput = input.nextInt();
        input.nextLine();



while(true) {
    if (userInput == 1) {
        addTask(myList);
    } else if (userInput == 2) {
        removeTask(myList);
    } else if (userInput == 3) {
        updateTask(myList);
    } else if (userInput == 4) {
        listTask(myList);
    } else if (userInput == 0) {
        System.out.println("you have exited");
        System.exit(0);
    }
    System.out.println("type 1 to add a task");
    System.out.println("type 2 to remove a task");
    System.out.println("type 3 to update a task");
    System.out.println("type 4 to list all task");
    System.out.println("type 0 to exit");
    System.out.println("please make a selection");
    userInput = input.nextInt();
    input.nextLine();
}




    }
    static void addTask(ArrayList<String> a){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what task do you want to add");
        String task =myObj.nextLine();
        a.add(task);
    }

    static void removeTask(ArrayList<String> a){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what task do you want to remove");
        String task =myObj.nextLine();
        a.remove(task);
    }
    static void updateTask(ArrayList<String> a){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what index would you like to replace");
        int ind=myObj.nextInt();
        myObj.nextLine();
        System.out.println("what would you like to replace it as");
        String task =myObj.nextLine();
        a.set(ind,task);


    }

    static void listTask(ArrayList<String> a){
        System.out.println("your tasks are " + a);
    }



}