//Day 2: Operators, 

class Day2 {
    public static void main(String[] arguments) {
        // Opeartions

        int number1 = 10;
        int number2 = 5;

        System.out.println(number1 + number2); //Addition: 10 + 5 = 15
        System.out.println(number1 - number2); //Subtraction: 10 - 5 = 5
        System.out.println(number1 * number2); //Multiplication: 10 * 5 = 50
        System.out.println(number1 / number2 + "\n"); //Division: 10 / 5 = 2

        int number3 = 17;
        int number4 = 4;

        System.out.println(number3 / number4); //Division: 17 / 4 = 4 *Rounds Down*
        System.out.println(number3 % number4 + "\n"); //Modulus: 17 % 4 = 1 *Remainder from Division above*
    }
}
