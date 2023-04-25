//mason 2/6 project 1

//import java.sql.SQLOutput;
/*Modify your code from Project 2 so that the class representing tasks implements
the appropriate interface allowing tasks to be sorted based first on
their priority than on their name.  If two tasks have different priorities,
the task with the greater priority appears before the other task.  If two
tasks have the same priority, then the task whose name would appear first
alphabetically appears before the other task.  If two tasks have the same
priority and their names are the same, then they are "equal" with regard to
the comparison.

Additionally, modify the code from Project 2 to include a custom class
representing a collection of tasks.  This class should implement the
appropriate interface so that a for-each loop can be used to iterate through
all the tasks.  The order in which the tasks are returned for the for-each loop
is up to you.*/
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Task> myList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("type 1 to add a task");
        System.out.println("type 2 to remove a task");
        System.out.println("type 3 to update a task");
        System.out.println("type 4 to list all task");
        System.out.println("type 5 to list all task by priority");
        System.out.println("type 0 to exit");
        System.out.println("please make a selection");


        try{

            int userInput = input.nextInt();
            input.nextLine();
            while (true) {



            if (userInput == 1) {
                addTask(myList);
            } else if (userInput == 2) {
                removeTask(myList);
            } else if (userInput == 3) {
                updateTask(myList);
            } else if (userInput == 4) {
                listTask(myList);
            } else if (userInput == 5) {
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
        catch(Exception e){

                System.out.println("something went wrong");
            }

    }


    static void addTask(ArrayList<Task> a) {
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //System.out.println("what task do you want to add");
        //String task =myObj.nextLine();
        System.out.println("please enter a title");
        String title = input.nextLine();
        System.out.println("please enter a description");
        String desc = input.nextLine();
        System.out.println("please enter a priority");
        int prio = input.nextInt();
        input.nextLine();
        Task task = new Task(title, desc, prio);
        a.add(task);
        //return a;
    }

    static void removeTask(ArrayList<Task> a) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the index of the task you want to remove");
        int task = myObj.nextInt();

        a.remove(task);
    }


    static void updateTask(ArrayList<Task> a) {
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("what index would you like to replace");
        int ind = myObj.nextInt();
        myObj.nextLine();
        System.out.println("please enter a title");
        String title = input.nextLine();
        System.out.println("please enter a description");
        String desc = input.nextLine();
        System.out.println("please enter a priority");
        int prio = input.nextInt();
        a.set(ind, new Task(title, desc, prio));

    }

    static void listTask(ArrayList<Task> a) {
        Collections.sort(a);
        System.out.println("your tasks are " + a);
    }

    static void listprio(ArrayList<Task> a) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("what priority do you want to list");
        int pr = myObj.nextInt();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPriority() == pr) {
                System.out.println("your tasks are " + a.get(i));
            }
        }
    }


}

class Task implements Comparable<Task>,Iterable<Task> {
    private String title;
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

    @Override
    public int compareTo(Task o) {
        int compareResult=this.title.compareTo(o.title);
        if (compareResult==0){
            if(this.getPriority()<o.getPriority()){
                return -1;
            }else{
                return 1;
            }

        }else{
            return compareResult;
        }


    }

    @Override
    public Iterator<Task> iterator() {
        return Main.myList.iterator();
    }
}

