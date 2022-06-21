public class StringCalculator {
    public static int add(final String numbers) {
        if(numbers == null) {
            return 0;
        }

        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n(,)");
        for (String number : numbersArray) {
            int check = Integer.parseInt(number.trim());
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}