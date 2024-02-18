import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Project[] projects = new Project[10];
        Task task1 = new Task();
        task1.description = "Task 1 desc";
        task1.duration = 1;

        System.out.println(task1);

        Task task2 = new Task("Task 2 desc", 2);
        Task task3 = new Task("Task 3 desc", 3);
        Task task4 = new Task("Task 4 desc", 1);

        //ArrayList<Task> tasks = new ArrayList<>();
//        tasks.add(task2);
//        tasks.add(task3);
//        tasks.add(task4);
        Task[] tasks = {task1, task2, task3, task4};

        Project projet1 = new Project(tasks);
        System.out.println(projet1.getStatus());

        for (Task task: tasks){
            System.out.println(task.toString());
        }
    }
}