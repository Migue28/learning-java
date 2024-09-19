import java.util.function.Consumer;

public class HelloWorldFunction {
    public static void main(String[] args) {
        // Define a function (lambda) that prints a message
        Consumer<String> printMessage = message -> System.out.println(message);
        
        // Call the function with the message
        printMessage.accept("Hello, World!");
    }
}
