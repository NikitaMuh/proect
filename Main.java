import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Здравствуйте " + name + " ваш возрвст " + age + " лет ");
    }
}
