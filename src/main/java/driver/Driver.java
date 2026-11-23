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
                case 6 -> fileManager.saveTasks(tasks);
                    fileManager.saveTasks(tasks);
                    System.out.println("Tasks saved!");
                    running = false;
                }
                default -> System.out.println("Please choose an option from 1 to 6.");
            }
        }
    }
    private void showMenu() {

    }

    private void addTask() {

    }

    private void displayTasks() {

    }

    private void markTaskComplete() {

    }

    private void removeTask() {

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
