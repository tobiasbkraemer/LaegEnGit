import java.util.Scanner;

public class SuperGreeter3 {
    Scanner keyboard = new Scanner(System.in);
    public void start () {
        System.out.println("Hej! Hvad hedder du?");
    }

    public void greet () {
        String navn = keyboard.nextLine();
        System.out.println("Hej " + navn+ "!");

    }

    public static void main(String[] args) {
        SuperGreeter3 sg = new SuperGreeter3();
        sg.start();
        sg.greet();
    }
}
