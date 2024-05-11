import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
//    takeOutputAndCalculation();
        changeDataValue();
    }

    /*
    * datatype checking
    * */
    static void takeOutputAndCalculation(){
        /*
        * in array we need to specify data type only that type of data can be stored
        * but in object type array any datatype value can be stored
        *  */
        Object[] arr=new Object[3];
        System.out.println("Please Enter A Number: ");
        Scanner integer = new Scanner(System.in);
        arr[0] = integer.nextInt();
        System.out.println("Please Enter A Float: ");
        Scanner floatData = new Scanner(System.in);
        arr[1] = floatData.nextFloat();
        System.out.println("Please Enter A String: ");
        Scanner string = new Scanner(System.in);
        arr[2] = string.nextLine();

        for (Object s : arr) {
            /* checking the datatype */
            if(s instanceof Integer)
                System.out.println(s+" :this is integer");
            if(s instanceof String)
                System.out.println(s+": this is a string");
            if(s instanceof Float)
                System.out.println(s+": this is a float");
        }
    }

    /*
    * changing data value and array reverse
    * */
    static void changeDataValue(){
        Object[] arr=new Object[3];
        System.out.println("Please Enter A Number: ");
        Scanner integer = new Scanner(System.in);
        arr[0] = integer.nextInt();
        System.out.println("Please Enter A Float: ");
        Scanner floatData = new Scanner(System.in);
        arr[1] = floatData.nextFloat();
        System.out.println("Please Enter A String: ");
        Scanner string = new Scanner(System.in);
        arr[2] = string.nextLine();
        /*
        * we cannot reverse a normal array but can reverse a list
        * so here we are making the array as list by Arrays.asList(arr) and then reversing using collection
        * converting array to string like Arrays.toString(arr) to print it
        * */
        Collections.reverse(Arrays.asList(arr));
//        System.out.printf(Arrays.toString(arr));
//        System.exit(0);
        for (Object s : arr) {
            /* checking the datatype */
            if(s instanceof Integer)
                System.out.println(s+" :this is integer");
            if(s instanceof String)
                System.out.println(s+": this is a string");
            if(s instanceof Float)
                System.out.println(s+": this is a float");
        }
    }
}
