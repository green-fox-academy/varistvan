public class TodoApp {
    private final TaskService taskService;

    public TodoApp() {
        this.taskService = new TaskService();
    }

    public void run(String[] args) {
        if (args.length < 1) {
            printUsage();
            return;
        }

        if (args[0].equals("-l")) {
            taskService.listAllTasks();
            return;
        }

        if (args[0].equals("-a")) {
            if (args.length < 2) {
                System.out.println("Unable to add: no task provided");
                return;
            }

            taskService.addTask(args[1]);
            return;
        }

        if (args[0].equals("-c")) {
            if (args.length < 2) {
                System.out.println("Unable to check: no index provided");
                return;
            }

            try {
                taskService.completeTask(Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
            }
            return;
        }

        if (args[0].equals("-r")) {
            if (args.length < 2) {
                System.out.println("Unable to remove: no index provided");
                return;
            }

            try {
                taskService.removeTask(Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number");
            }
            return;
        }

        System.out.println("Unsupported argument");
    }

    private void printUsage() {
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes an task\n" +
                " -c   Completes an task");
    }
}
