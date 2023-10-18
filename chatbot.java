import java.util.Scanner;

public class chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How can I help you today?");
        while (true) {
            String userMessage = scanner.nextLine();
            if (userMessage.equalsIgnoreCase("hello")) {
                System.out.println("Hi there!");
            } else if (userMessage.equalsIgnoreCase("how are you?")) {
                System.out.println("I'm just a program, but I'm here to help you!");
            } else if (userMessage.equalsIgnoreCase("what is your name?")) {
                System.out.println("I am a simple chatbot.");
            } else if (userMessage.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye! Have a nice day!");
                break;
            } else {
                System.out.println("I'm sorry, I don't understand. Can you please be more specific?");
            }
        }
    }
}
