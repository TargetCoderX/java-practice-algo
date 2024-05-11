public class Output_Formatting {
    public static void main(String[] args) {

        /* adding pre defined data in java array like this */
        Object[] arr = {"java 100", "cpp 65", "python 50"};
        formatOutput(arr);
    }

    static void formatOutput(Object[] objects) {
        for (Object object : objects) {
            /*
             * split in java nd typecasting
             * only strings can be split
             * */
            String text = (String) object;
            String[] parts = text.split(" ");
            /*
             * %s: This is a placeholder for a string. When used with String.format(),
             * it indicates that a string should be inserted at this position in the formatted string.
             *
             * "%-": This part of the format string specifies that the string should be left-justified within the specified width.
             * The - flag indicates left side gap. Default is right side
             * */

            int padNumber = Integer.parseInt(parts[1]);
            /*
             * padding with 0's
             * "%03d" means need to me make 3 digit makeup with leading 0's
             * */
            String formattedString = String.format("%-" + 15 + 's', parts[0]);
            System.out.println(formattedString + String.format("%03d", padNumber));
        }
    }
}
