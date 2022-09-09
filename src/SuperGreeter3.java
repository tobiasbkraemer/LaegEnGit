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

    public void smallTalk () {
        System.out.println("Hvor gammel er du?");
        int alder = keyboard.nextInt();
        System.out.println("Fedt! "+alder+" er gammelt nok til mig ;)");
    }

    public static void main(String[] args) {
        SuperGreeter3 sg = new SuperGreeter3();
        sg.start();
        sg.greet();
        sg.smallTalk();
    }
}
