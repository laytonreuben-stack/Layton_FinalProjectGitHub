package driver;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Driver {
    private final ArrayList<Task> tasks;
    private final TaskFileManager fileManager;
    private final Scanner scanner;

    public Driver() {
        fileManager = new TaskFileManager("tasks.txt");
        tasks = fileManager.loadTasks();
        scanner = new Scanner(System.in);
    }


    public static void main(String[] args) {
        new Driver().run();
    }

    private void run() {
        System.out.println("Welcome to the Classwork Planner!");

        boolean running = true;
        while (running) {
            showMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1 -> displayTasks();
                case 2 -> addTask();
                case 3 -> markTaskComplete();
                case 4 -> removeTask();
                case 5 -> showUpcomingTasks();
                case 6 -> {
                    fileManager.saveTasks(tasks);
                    System.out.println("Tasks saved!");
                    running = false;
                }
                default -> System.out.println("Please choose an option from 1 to 6.");
            }
        }
    }
    private void showMenu() {
        System.out.println("""
                |> Classwork Planner <|
                1. View My Tasks
                2. Add Task
                3. Mark Tasks Complete
                4. Remove Task
                5. View Deadlines
                6. Save And Exit
                """);
    }

    private void addTask() {
        System.out.println("\nAdd task");

        String course = readRequiredText("Course: ");
        String title = readRequiredText("Assignment name: ");
        String description = readRequiredText("Description: ");
        LocalDate dueDate = readDate("Due date (YYYY-MM-DD): ");
        double hours = readNonNegativeDouble("Estimated study hours: ");

        tasks.add(new Task(course, title, description, dueDate, hours));
        fileManager.saveTasks(tasks);
        System.out.println("Task added!");
    }

    private void displayTasks() {
        System.out.println("\nAll Tasks");

        if (tasks.isEmpty) {
            System.out.println("No tasks have been added");
            return;
        }

        for (int i = 0; i < task.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private void markTaskComplete() {
        displayTasks();

        if (tasks.isEmpty) {
            return;
        }

        int number = readInt("Enter the task number to mark complete: ");

        if (!isValidTaskNumber(number)) {
            System.out.println("Task number is not valid");
            return;
        }

        tasks.get(number - 1).markComplete();
        fileManager.saveTasks(tasks);
        System.out.println("Tasks marked complete");
    }

    private void removeTask() {
        displayTasks();

        if (tasks.isEmpty()) {
            return;
        }

        int number = readInt("Enter the task number to remove: ");

        if (!isValidTaskNumber(number)) {
            System.out.println("Task number is not valid");
            return;
        }

        Task removed = tasks.remove(number - 1);
        fileManager.saveTasks(tasks);
        System.out.println("Removed: " + removed.getTitle());
    }

    private void showUpcomingTasks() {

    }

    private boolean isValidTaskNumber(int number) {

    }

    private String readRequiredText(String prompt) {

    }

    private int readInt(String prompt) {

    }

    private double readNonNegativeDouble(String prompt) {

    }

    private LocalDate readDate(String prompt) {

    }
}
