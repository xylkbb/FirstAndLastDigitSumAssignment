public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        //Get the last digit:  mod the number by 10:
        // store in some variable

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0){
            firstDigit = number;
            number /= 10;
        }
        // set firstDigit to number
        // divide equals number by 10

        return firstDigit + lastDigit;
        // return the sum of first and last digits

    }
}