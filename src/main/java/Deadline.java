public class Deadline extends Task {
    protected String by;

    /**
     * Adds a new deadline task.
     *
     * @param description Description of task.
     * @param by Deadline time of task.
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}

