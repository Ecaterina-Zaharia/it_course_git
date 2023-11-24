import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// 1. Create a functional interface that takes a list of integers and returns a list of integers.
// Use a lambda expression to implement this interface,
// such that it returns a list containing only the odd numbers from the original list.

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListOfIntegers listOfIntegers = (input) -> {
            List<Integer> result = new ArrayList<>();
            for(int num : input){
                if(num %2 !=0){
                    result.add(num);
                }
            }
            return result;
        };

        new ListOfIntegers(){

            @Override
            public List<Integer> transform(List<Integer> input) {
                return null;
            }
        };

        List<Integer> oddList = listOfIntegers.transform(numbers);
        System.out.println("Odd numbers " + oddList);

        // 2. Create a functional interface with a method that takes a List<String> representing
        // first names and returns a List<String> of those names formatted in uppercase.
        // Implement it using a lambda expression.

        List<String> firstNames = new ArrayList<>();
        firstNames.add("Ann");
        firstNames.add("Peter");
        firstNames.add("Alexander");
        firstNames.add("Pi");
        firstNames.add("John");

        ListOfFirstName listOfFirstName = (frname) -> {
            List<String> upperResult = new ArrayList<>();
            for(String name : frname){
                upperResult.add(name.toUpperCase());
            }
            return upperResult;
        };

        List<String> uppercaseNames = listOfFirstName.listOfFirstName(firstNames);
        System.out.println("Uppercase names " + uppercaseNames);

        // 3. Create a functional interface that is generic and takes a list of generic items and
        // a single generic item, returning a boolean indicating whether the item is in the list.
        // Implement this interface using a lambda expression.

        List<String> namesList = List.of("John", "Mary", "Peter", "Sarah");

        ListOfGenericItems<String> contains = (list, item)-> list.contains(item);

        boolean containsName = contains.contains(namesList, "Peter");
        System.out.println("Contains name " + containsName);

        // 4. Create a functional interface that takes a single double as a parameter and returns a double.
        // Implement it using a lambda expression to create a utility
        // that returns the square root of the input value.

        SquareRoot sqrt = (x) -> Math.sqrt(x);
        double result = sqrt.calculateSquareRootOfInput(25.0);
        System.out.println("Square root of 25 " + result);

        // 5. Create a functional interface with a method that takes two strings and returns a string.
        // Implement this interface using a lambda expression to create a utility
        // that joins two strings with a space in between.

        StringJoiner stringJoiner = (s1, s2) -> s1 + " " + s2;

        String finalResult = stringJoiner.join("Java","Course");
        System.out.println("Joined string " + finalResult);

        // 6. Create a functional interface with a method that takes two strings as input and returns an integer.
        // Implement this interface using a lambda expression
        // to create a custom comparator that compares strings based on their length (not lexicographically).

        StringLengthComparator comparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());

        int comparedResult = comparator.comapre("Hello", "Hiiiiiiiiiiii");
        System.out.println("Comparison result is: " + comparedResult);

        // 7. Create a functional interface that takes a string and an integer n as parameters and returns a string.
        // Implement it using a lambda expression that returns the first n characters of the string.
        // If n is larger than the length of the string, it should return the full string.

        NumberOfCharactersOfString numberOfCharactersOfString = (sr1, n) ->
                sr1.substring(0, Math.min(n, sr1.length()));

        String result1 = numberOfCharactersOfString.calculateNumberOfCharacters("Alexandra", 3);
        System.out.println("Truncated string 1: " + result1);

        String result2 = numberOfCharactersOfString.calculateNumberOfCharacters("Aliba-ba", 20);
        System.out.println("Truncated string 1: " + result2);

    }
}

@FunctionalInterface
interface ListOfIntegers{
    List<Integer> transform(List<Integer> input);
}

@FunctionalInterface
interface ListOfFirstName{
    List<String> listOfFirstName(List<String> frname);
}

@FunctionalInterface
interface ListOfGenericItems<T>{
    boolean contains(List<T> list, T item);
}

@FunctionalInterface
interface SquareRoot{
    double calculateSquareRootOfInput(double input);
}

@FunctionalInterface
interface StringJoiner{
    String join(String s1, String s2);
}

@FunctionalInterface
interface StringLengthComparator{
    int comapre(String str1, String str2);
}

@FunctionalInterface
interface NumberOfCharactersOfString{
    String calculateNumberOfCharacters(String sr1, int n);
}