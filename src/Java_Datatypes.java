import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {
        /* non stop execution */
        do {
            try {
                /*
                * in java if I want to create key value pair array we have to use this
                * here we will see putting the value in this array
                * also will see how to get the data from this
                * example
                * [
                    "fruit"=>"mango",
                    "animal"=>"Tiger",
                   ]
                * */

                Map<String, String> keyValuePair = new HashMap<>();
                long dataLength = 0;
                String[] ArrayDataTypes = {"byte", "short", "int", "long"};
                for (int i = 0; i < 4; i++) {
                    /*
                     * min value and max value can be get by this
                     * */
                    switch (ArrayDataTypes[i]) {
                        case "byte":
                            dataLength = Byte.MAX_VALUE;
                            break;
                        case "short":
                            dataLength = Short.MAX_VALUE;
                            break;
                        case "int":
                            dataLength = Integer.MAX_VALUE;
                            break;
                        case "long":
                            dataLength = Long.MAX_VALUE;
                            break;
                        default:
                            break;
                    }
                    keyValuePair.put(ArrayDataTypes[i], String.valueOf(dataLength));
                }
                System.out.println("Give A Number");
                Scanner scan = new Scanner(System.in);
                long givenData = scan.nextLong();
                /*
                 * get the entry set
                 * */
                boolean flag = false;
                try {
                    for (Map.Entry<String, String> entry : keyValuePair.entrySet()) {
                        long positiveValue = Long.parseLong(entry.getValue());
                        long negativeValue = Long.parseLong(entry.getValue()) * -1;
                        if (givenData <= positiveValue && givenData >= negativeValue) {
                            flag = true;
                            System.out.println("Give value can fit in :" + entry.getKey());
                        }
                    }
                    if (!flag) {
                        System.out.println("This value cannot fit in any datatype, Thanks");
                    }
                } catch (Exception e) {
                    System.out.println("This value cannot fit in any datatype, Thanks");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Value will not fit in any datatype");
            }
        } while (true);
    }
}
