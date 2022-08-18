import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        // Define variables
        final String GREETING = "Hello";
        Map<String, Boolean> options = new HashMap<>();
        options.put("interactive", false);
        options.put("stdin", false);
        String name = "World";

        // Building Application's context
        // Check for commandline args
        name = parseArgs(args, name, options);

        // Responding to the user
        System.out.println(GREETING + ", " + name + "!");
    }

    public static String parseArgs(String[] args, String name, Map<String, Boolean> options) {
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
                        options.replace("interactive", true);
                        // Interactive mode
                        break;
                    case "--stdin":
                    case "-s":
                        options.replace("stdin", true);
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
        return name;
    }
}