package driver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskFileManager {
    private final Path filePath;

    public TaskFileManager(String fileName) {
        filePath = Path.of(fileName);
    }

    public ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        // NOT FINISHED do if, try, catch
    }

    public void saveTasks(ArrayList<Task> tasks) {
        // NOT FINISHED
    }
}
