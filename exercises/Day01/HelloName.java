public class HelloName {
    public static void main(String[] args) {
        // Check if an argument was passed to avoid crashing
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
            System.out.println("Welcome to Java.\nLet's learn step by step.");
        } else {
            System.out.println("Please provide your name as an argument!");
            System.out.println("Usage: java HelloName <YourName>");
        }
    }
}
