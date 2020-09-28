package duke.task;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public Task getTask(int taskIndex) {
        return tasks.get(taskIndex);
    }

    public ArrayList<Task> getAllTasks() {
        return tasks;
    }

    public ArrayList<Task> getDateTasks(LocalDate date) {
        ArrayList<Task> dateTasks = new ArrayList<>();
        for (Task t : tasks) {
            if ((t instanceof Deadline || t instanceof Event) && t.date.equals(date)) {
                dateTasks.add(t);
            }
        }
        return dateTasks;
    }

    public void markTaskDone(int taskDoneIndex) {
        tasks.get(taskDoneIndex).markAsDone();
    }

    public void deleteTask(int taskDeleteIndex) {
        tasks.remove(taskDeleteIndex);
    }

}