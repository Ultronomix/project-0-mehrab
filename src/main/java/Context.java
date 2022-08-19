import java.util.Scanner;

public class Context {
    private String name;

    public Context(String[] args) {
        parseArgs(args);
    }

    public void parseArgs(String[] args) {
        String name = "World";
        if (args.length > 0) {
            // Loop through and set up flags
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "--name":
                    case "-n":
                        name = args[i+1];
                        i++;
                        break;
                    case "--interactive":
                    case "-i":
                        // Interactive mode
                        break;
                    case "--stdin":
                    case "-s":
                        Scanner scanner = new Scanner(System.in);
                        if (scanner.hasNext()) {
                            name = scanner.nextLine();
                        }
                        break;
                    default:
                        System.out.println("Unknown arg: " + args[i] + "\nUsage: App [-n] Name");
                        break;
                }
            }
        } 
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
