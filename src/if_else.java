import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        ifelse();
    }
     static void ifelse(){
        System.out.println("Please give a number: ");
        Scanner scanner = new Scanner(System.in);
        int givenData = scanner.nextInt();
        if(givenData%2 !=0){
            System.out.println("Weird");
        }else if(givenData >= 2 && givenData <= 5){
            System.out.println("Not Weird");
        }else if(givenData >= 6 && givenData <= 20){
            System.out.println("Weird");
        }else if(givenData > 20){
            System.out.println("Not Weird");
        }
    }
}
