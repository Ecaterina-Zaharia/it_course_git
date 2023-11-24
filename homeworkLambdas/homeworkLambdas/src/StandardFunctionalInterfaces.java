import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class StandardFunctionalInterfaces {
    public static void main(String[] args){

        // 8. Try to rethink the above exercises
        // and use already existing standard functional interfaces provided by Java (if possible).

        // 4. Create a functional interface that takes a single double as a parameter and returns a double.
        // Implement it using a lambda expression to create a utility
        // that returns the square root of the input value.

        DoubleUnaryOperator sqrt = Math::sqrt;
        double result = sqrt.applyAsDouble(25.0);
        System.out.println("Square root of 25: " + result);

        // 5. Create a functional interface with a method that takes two strings and returns a string.
        // Implement this interface using a lambda expression to create a utility
        // that joins two strings with a space in between.
        BinaryOperator<String> myBinaryOperator = (s1, s2) -> s1 + " " + s2;
        System.out.println(myBinaryOperator.apply("Java", "course"));

        // 6. Create a functional interface with a method that takes two strings as input and returns an integer.
        // Implement this interface using a lambda expression
        // to create a custom comparator that compares strings based on their length (not lexicographically).

        Function<String, Integer> myFuction = s ->{
            if(s !=null){
                return  s.length();
            }
            return -1;
        };
        Integer lengthSize1 = myFuction.apply("Moon");
        Integer lengthSize2 = myFuction.apply("Terra");
        System.out.println(lengthSize1.compareTo(lengthSize2));

        // 7. Create a functional interface that takes a string and an integer n as parameters and returns a string.
        // Implement it using a lambda expression that returns the first n characters of the string.
        // If n is larger than the length of the string, it should return the full string.

        BiFunction<String, Integer, String> truncator = (s,n) -> s.substring(0, Math.min(n, s.length()));

        String result1 = truncator.apply("A lot of words", 5);
        System.out.println("Truncated string1: " + result1);

        String result2 = truncator.apply("Hello", 20);
        System.out.println("Truncator string2: " + result2);

    }
}
