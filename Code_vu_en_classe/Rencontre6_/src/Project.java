public class Project {
    private Task[] tasks;
    private Status status = Status.NOT_STARTED;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public Project(Task[] tasks) {
        this.tasks = tasks;
    }

}
