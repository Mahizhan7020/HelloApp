public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Loop through all names provided
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default greeting if no arguments
            System.out.println("Hello, World!");
        }
    }
}