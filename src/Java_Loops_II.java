import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        System.out.println("Give Series Space Separated: ");
        Scanner scan = new Scanner(System.in);
        String series = scan.nextLine();
        calculate(series);
    }

    static void calculate(String givenSeries) {
        /*
         * get data from space separated string
         *  */
        String[] parts = givenSeries.split(" ");
        int commonStarter = Integer.parseInt(parts[0]);
        int multiplier = Integer.parseInt(parts[1]);
        int limit = Integer.parseInt(parts[2]);
        int tempData = 0;
        int j = 1;
        for (int i = 0; i < limit; i++) {
            tempData = commonStarter + (j * multiplier);
            System.out.println(tempData);
            commonStarter = tempData;
            j = j * 2;
        }
    }
}
