public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement");
        System.out.println("Notice that it ends with a semicolon");
        System.out.println("When we create statements: they MUST end with a semicolon.");
        System.out.println("Or Java will get mad at us.");

        /*
         * This is a mulit-line comment.
         * It can go on for multiple lines.
         * It is useful for commenting out large sections of code.
         * Ain't that neat?
         */

        byte smallNum = 19;
        System.out.println(smallNum);
        smallNum = 126;
        smallNum++;
        System.out.println(smallNum);

        char firstLetterOfName = 'J';

        String name = "Jesse"; // String is a class, not a primitive type, double quotes (objects)
        String quote = "\"This is a quote\""; // escape character
        System.out.println(quote);
        System.out.println(name);

        int numDefault;
        System.out.println(
            "This is the default value of an int: " + numDefault; // default value is 0

        final String EMPORER_OF_IMUGI = "Rick \"The Ruler\" Sanchez"; // convention for constants is all caps
    }
}
