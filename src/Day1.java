
// Day #1: Hello World & Variables, Data Types
class Day1 {
    public static void main(String[] arguments) {
        
        // Hello World
        System.out.println("Hello World!");

        // Variables

        int age = 15; // <-- Initialize Variable
        age = 14; // <-- Overwrite Variable
        System.out.println("Hello! I am " + age + " years old.\n");

        // Data Types: Primitive

        // Integer

        int number = 10;
        System.out.println(number); // Range: -2,147,483,648 to 2,147,483,647

        byte number2 = 100;
        System.out.println(number2); // Range: -128 to 127

        short number3 = 1000;
        System.out.println(number3); // Range: -32,768 to 32,767

        long number4 = 1000000000000000000L;
        System.out.println(number4 + "\n"); // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // Floating Point/Decimal Types

        float number5 = 10.523462342f;
        System.out.println(number5); // Range: 3.4e−038 to 3.4e+038

        double number6 = 10.5;
        System.out.println(number6 + "\n"); // Range: 1.7e−308 to 1.7e+308

        // Booleans
        boolean isDayOff = true;
        System.out.println(isDayOff);

        boolean isSchoolDay = false;
        System.out.println(isSchoolDay + "\n");

        // Characters

        char copyright = '\u00A9';
        System.out.println("This is the copyright symbol! " + copyright + "\n"); 
        
        // May appear as a diamond with a question mark on some systems

        // Implicit Conversion

        int number7 = 100;
        double number8 = number7;

        System.out.println(number8);

        // Explicit Conversion

        double number9 = 100.5;
        int number10 = (int)number9; //Notice the (int) before the variable name

        System.out.println(number10 +  "\n");

        





    }
}

