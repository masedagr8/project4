//mason 2/6 project 1

//import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<String> myList=new ArrayList<>();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Task> myList = new ArrayList<>();
        System.out.println("type 1 to add a task");
        System.out.println("type 2 to remove a task");
        System.out.println("type 3 to update a task");
        System.out.println("type 4 to list all task");
        System.out.println("type 5 to list all task by priority");
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
    }else if (userInput == 5) {
        listprio(myList);
    } else if (userInput == 0) {
        System.out.println("you have exited");
        System.exit(0);
    }
    System.out.println("type 1 to add a task");
    System.out.println("type 2 to remove a task");
    System.out.println("type 3 to update a task");
    System.out.println("type 4 to list all task");
    System.out.println("type 5 to list all task by priority");
    System.out.println("type 0 to exit");
    System.out.println("please make a selection");
    userInput = input.nextInt();
    input.nextLine();
}




    }
    static void addTask(ArrayList<Task> a){
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //System.out.println("what task do you want to add");
        //String task =myObj.nextLine();
        System.out.println("please enter a title");
        String title=input.nextLine();
        System.out.println("please enter a description");
        String desc=input.nextLine();
        System.out.println("please enter a priority");
        int prio=input.nextInt();
        input.nextLine();
        Task task=new Task(title,desc,prio);
        a.add(task);
        //return a;
    }

    static void removeTask(ArrayList<Task> a){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the index of the task you want to remove");
        int task =myObj.nextInt();

        a.remove(task);
    }


    static void updateTask(ArrayList<Task> a){
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("what index would you like to replace");
        int ind=myObj.nextInt();
        myObj.nextLine();
        System.out.println("please enter a title");
        String title=input.nextLine();
        System.out.println("please enter a description");
        String desc=input.nextLine();
        System.out.println("please enter a priority");
        int prio=input.nextInt();
        a.set(ind,new Task(title,desc,prio));

    }

    static void listTask(ArrayList<Task> a){
        System.out.println("your tasks are " + a);
    }
    static void listprio(ArrayList<Task> a){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what priority do you want to list");
        int pr =myObj.nextInt();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPriority()==pr) {
                System.out.println("your tasks are " + a.get(i));
            }
        }
    }



}
class Task {
    private  String title;
    private String desc;
    private int priority;

    public Task(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", priority=" + priority +
                '}';
    }
}

