package java101;

/**
 * Created by RyanHarper on 9/18/17.
 */
public class HelloWorld {
    //psvm = shortcut to write
    //entry point, the beginning of the program
    public static void main(String[] args) {
        //public always needs to be there
        //static always needs to be there
        //void always needs to be there
        //main, no change
        //string[] no change
        //args is the only thing that can change.

        //general syntax: type identifier;

        //============================================ BASIC TYPES =====================================================
        // camelCase;

        //4 types of integers assigned to the largest allowed:
             byte byteNumber = 127;
             short shortNumber = 32767;
             int intNumber = 2147483647;
             long longNumber = 9223372036854775807L;

        // floating point numbers:
             float floatNumber = 2.1f;
             double doubleNumber = 10.5;

        // single characters:
            char singleCharacter = 'L';

        // true or false value:
            boolean booleanValue = true;

        // ========================================== STRINGS ==========================================================
        // String is a Class with methods, properties. Strings are only references to characters, they aren't values.
        // always double quotes;

        String cohortName = "Redwood";

        //const MY_CONSTANT = 4;
        final int MY_CONSTANT = 4;

        // ===================================== ARITHMETIC EXPRESSIONS ================================================

        System.out.println(3 + 4);
        System.out.println(3 - 4);
        System.out.println(3 * 4);
        System.out.println(3 / 4.0);
        float division = 3.0f / 4;
        System.out.println(division);
        System.out.println(3 % 4);

        int x = 5;
        System.out.println(x++); // 5
        System.out.println(++x); // 7
        System.out.println(x--); // 7
        System.out.println(--x); // 5
        x += 3; // 8
        System.out.println(x);
        x %= 2; // 0
        System.out.println(x);

        //================================= CASTING ====================================================================
        // it is only valid if the value on the right is smaller than the type on the left
        double aDoubleNumber = 10; // from int to double

        //explicit type casting
        // type varible = (type) aBiggerTypeVariable
        int aIntegerNumber = (int)aDoubleNumber; // before casting (int), there was an error.

        System.out.println(aDoubleNumber);
        System.out.println("Hello World!");
        System.out.print("Hello Redwood!");
        //sout = shortcut to write
    }
}
//compilation then execution.
