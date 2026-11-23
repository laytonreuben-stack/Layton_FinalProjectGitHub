package driver;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task {
    private final String courseName;
    private final String title;
    private final String description;
    private final LocalDate dueDate;
    private final double estimatedHours;
    private final boolean isComplete;

    public Task(String courseName, String title, String description, LocalDate dueDate, double estimatedHours) {

    }

    private Task(String courseName, String title, String description, LocalDate dueDate, double estimatedHours, boolean isComplete) {

    }

    public void markComplete() {

    }

    public long daysUntilDue() {

    }

    public String toFileString() {

    }

    public static Task fromFileString(String line) {

    }

    private static String encode(String value) {

    }

    private static String decode(String value) {

    }

    public String getCourseName() {

    }

    public String getTitle() {

    }

    public String getDescription() {

    }

    public LocalDate getDueDate() {

    }

    public double getEstimatedHours() {

    }

    public boolean isComplete() {

    }

    public String toString() {

    }
}
