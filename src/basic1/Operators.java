package basic1;

public class Operators {
    public static void main(String[] args) {

        // ASSIGMENT OPERATORS
        int a = 10;
        System.out.println(a);
        a += 10;
        a -= 5;
        a *= 2;
        a /= 10;
        System.out.println(a);

        //BASIC ARITHMETIC OPERATORS

        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;

        System.out.println(num3);

        num3 = num2 - num1 - 5;  // 5
        num3 = num2 * (num1 - 8); // 40
        num3 = num2 / num1;  // 2
        num3 = 24 % 7;
        System.out.println(num3);

        //INCREMENTATION OPERATORS
        // add
        int someVariable = 100;
        someVariable += 1;
        someVariable = someVariable + 1;
        someVariable++;

        //subtract
        someVariable -= 1;
        someVariable = someVariable - 1;
        someVariable--;

        System.out.println(someVariable);

        int value1 = 57;
        value1 += 10;
        System.out.println(value1 + 10);
        value1++;
        System.out.println(value1);

       // RELATIONAL OPERATORS

        //Equality
       int c = 10;
       int b = 10;

       boolean var1 = false;
       boolean var2 = false;

        System.out.println(var1 == var2);

        //Inequality != - checks if the two arguments are different

        System.out.println(c != b);

        // Greater than > and greater than or equal to

        System.out.println(c > b);

        // Less then < and less than equal to <= - the opposite of above

        System.out.println(c <= b);

        //LOGICAL OPERATORS

        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.println(boolValue1 && boolValue2);

        // || - alternative, which is a

        System.out.println(boolValue1 || boolValue2);
        // ! negation
        System.out.println(!boolValue1 ||boolValue2);










    }
}
