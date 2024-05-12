import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        calculateData(givenNumber);
    }

    static void calculateData(int givenNumber) {
        for (int i = 1; i <= 10; i++) {
            int calculation = givenNumber * i;
            System.out.println(givenNumber + "*" + i + '=' + calculation);
        }
    }
}
