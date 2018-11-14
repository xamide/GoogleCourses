public class SumOfNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        boolean isASeries = false;
        // this string will hold all the digits our for loop finds
        String allNumbers = "";

        if (!str.isEmpty()) {
            // convert user's String input to an array of characters
            char charArray[] = str.toCharArray();

            for (int i = 0; i < str.length(); i++) {
                // if a character from the string is a digit - it is a series of digits
                // convert the digit to a string and append it to an empty string
                if (Character.isDigit(charArray[i])) {
                    isASeries = true;
                    String digit = Character.toString(charArray[i]);
                    allNumbers = allNumbers.concat(digit);
                }

                // add a comma after the last digit appended if the character != digit & isASeries = true
                // series of digits has ended - set isASeries to false
                else if (!Character.isDigit(charArray[i]) && isASeries) {
                    allNumbers = allNumbers.concat(",");
                    isASeries = false;
                }
            }

            // split values from allNumbers into a String array to store separate numbers
            if (!allNumbers.isEmpty()) {
                String numArray[] = allNumbers.split(",");

                for (int b = 0; b < numArray.length; b++) {
                    // each number from the String array is converted to Integer and is added up to the sum result
                    sum += Integer.parseInt(numArray[b]);
                }
            }
            else {
                System.out.println("The string provided does not include digits. Result: " + sum);
            }
        }
        else {
            System.out.println("The string provided is empty. Result: " + sum);
        }
        return sum;
    }
}
