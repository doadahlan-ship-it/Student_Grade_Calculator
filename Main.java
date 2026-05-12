import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student score: ");
        double score = input.nextDouble();

        if(score >= 60)
            System.out.println("Pass");

        else
            System.out.println("Fail");
    }
}
