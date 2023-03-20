//Day 2: Operators and Learning more about Strings PT. 1

class Day2 {
    public static void main(String[] arguments) {
        // Opeartions (Artihmetic Operators)

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
    

    // Assignment Operators

    // double number5 = 10.7;
    // double number6 = 5.3;   We use the equal sign as an operator for ASSIGNMENT (variable = value)

    // Relational Operators

    int number7 = 100;
    int number8 = 200;

    System.out.println(number7 == number8); //Equal to: 100 == 200 = false
    System.out.println(number7 != number8); //Not equal to: 100 != 200 = true
    System.out.println(number7 > number8); //Greater than: 100 > 200 = false
    System.out.println(number7 < number8); //Less than: 100 < 200 = true
    System.out.println(number7 >= number8); //Greater than or equal to: 100 >= 200 = false
    System.out.println(number7 <= number8); //Less than or equal to: 100 <= 200 = true
    System.out.println("\n");

    // Relational Operators but with Boolean Values

    boolean isDayOff = true;
    boolean isSchoolDay = false;

    System.out.println(isDayOff || isSchoolDay); //Equal to: true == false = false

    // NOTE: The "||" (double pipe) operator is called the "OR" operator. It returns true if either of the operands is true.

    isSchoolDay = true;

    System.out.println(isDayOff || isSchoolDay); //Equal to: true == true = true
    System.out.println("\n");    

    //NOTE: Add the "!" behind the first variable in the print statement to make it false. Example: !isDayOff


    // Incrementation and Decrementation Operators

    int number9 = 10;
    int number10 = 20;

    System.out.println(number9++); //Incrementation: 10 + 1 = 11
    System.out.println(number10--); //Decrementation: 20 - 1 = 19

    //However the values don't actually change until you print them again. 
    // This is because the incrementation and decrementation operators are post-fix operators (the way in which the compiler reads the code)

    System.out.println(number9);
    System.out.println(number10);

    //To make it not work as a post-fix, put your opeaters before the variable. Example: ++number9

    int number11 = 69419;

    System.out.println(++number11 + "\n"); //Incrementation: 69420


    //String Concatenation (which was shown earlier)

    System.out.println("Hello" + " " + "World!");

    //From Characters to Strings

    char percent = '%';

    System.out.println("The percentage of students that passed the test was " + "100" + percent);

    String passRate = "100%"; //Has to be in double quotes

    System.out.println("The percentage of students that passed the test was " + passRate);

    //String Concatenation using placeholders like %s and %d

    String name = "John";
    int age = 20;
    String action = "playing basketball";
    String university = "Stanford University";
    String major = "Computer Science";
    String minor = "Data Science";

    System.out.printf("%s is %d years old and is, at the moment playing %s at %s. He has a major in %s and a minor in %s.", name, age, action, university, major, minor);

    //NOTE: The %s is a placeholder for a string and the %d is a placeholder for a number. 
    // With the printf method being the function of printing and formatting.

    //NOTE: The % and character is called format specifiers. Here is the list

    // %s - String
    // %d - Decimal Integer (Whole Number)
    // %f - Floating Point Number (Decimal Number) Includes doubles and floats
    // %c - Character
    // %b - Boolean
    // %n - New Line or \n (Line Break)
    // %t - Date/Time
    // %x - Hexadecimal

















    }
}
