import java.util.HashMap;
import java.util.Map;

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
        Context context = new Context(args);
        name = context.getName();

        // Responding to the user
        Response response = new Response(GREETING, name);
        System.out.println(response);
    }

    
}