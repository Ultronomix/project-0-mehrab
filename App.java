import java.util.Scanner;

class App {
    public static void main(String[] args) {
        // Check for commandline args
        if (args.length > 0) {
            // App -n NAME
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "--name":
                    case "-n":
                        System.out.println("Hello, " + args[i+1] +"!");
                        break;
                
                    default:
                        System.out.println("Unknown arg: " + args[i] + "\nUsage: App [-n] Name");
                        break;
                }
            }
        } else {
            // If no args, then check stdin
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                String name = scanner.nextLine();
                System.out.println("Hello, " + name + "!");
            } else {
                // If no args and no stdin
                System.out.println("Hello, World!");
            }
            scanner.close();
        }
    }
}