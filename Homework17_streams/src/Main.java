import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        // 1. Given a list of integers, create a new list that contains only the even numbers.
        // Use streams to achieve this.

        List<Integer> integer = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenList = integer.stream()
                .filter(s -> s % 2 == 0)
                .toList();

        System.out.println(evenList);

        System.out.println("--------");

        // 2. Using a list of strings, find and print the longest string using Java streams.

        List<String> string = List.of("Pi", "Tom", "John", "Alexandra");

        List<String> sortedList = string.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b)// ? a : b - if(a.length > b.length) { return a; } else { return b;}
                .lines().toList();

        System.out.println("The longest string is: " + sortedList);

        System.out.println("----------");

        // 3. Create a stream of numbers from 1 to 100 and use
        // the filter operation to retain only those numbers which are prime.

        IntStream.rangeClosed(1, 100)
                .filter(s -> {
                    if (s <= 1) {
                        return false;
                    }
                    for(int i = 2; i <= Math.sqrt(s); i++){
                        if(s % i == 0){
                            return false;
                        }
                    }
                    return true;
                })
                .forEach(System.out::println);

        System.out.println("----------");

        // 4. Given a list of strings, use streams to create a single string
        // which is a concatenation of all strings separated by a comma.

        List<String> string1 = List.of("Pi", "Tom", "John", "Alexandra");
        String sncStr = string1.stream()
                .collect(Collectors.joining(", "));
        System.out.println(sncStr);

        System.out.println("----------");

        // 5. Given a list of people (a class) with attributes:
        // first name, last name, and age; use streams to find all people who are older than 18 years.

        List<People> people = List.of(new People("John", "Smith", 25),
                new People("Ann", "Ohara", 13),
                new People("Jack", "Sparrow", 35));

        List<People> sortedByAge = people.stream()
                .filter(s -> s.getAge() > 18)
                .toList();
        System.out.println(sortedByAge);

        System.out.println("----------");

        // 6. Create a stream of integers from an array and find the sum of all integers using the reduce method.

        int[] numbersArray = {1, 2, 3, 4, 5, 6};
        Integer sum = Arrays.stream(numbersArray)
                .reduce( 0, Integer::sum);
        System.out.println(sum);

        System.out.println("----------");

        // 7. Use streams to transform a list of strings into a list of their respective lengths.

        List<String> string2 = List.of("Pi", "Tom", "John", "Alexandra");
        List<Integer> listOfLength = string2.stream()
                .map(String::length)
                .toList();

        System.out.println(listOfLength);

        System.out.println("-----------------");

        // 8. Given a string, use streams to count the number of vowels in it.

        String str = "Given a string, use streams to count the number of vowels in it.";
        long vowelCount = str.chars()
                .mapToObj(Character::toLowerCase)
                .filter(s -> "aeiou".contains(String.valueOf((long)s)))
                        .count();

        System.out.println("Number of vowels: " + vowelCount);

        System.out.println("-----------------");

        // 9. Using streams, find the total number of characters
        // across a list of strings excluding whitespace characters.

        List<String> listOfStr = List.of("Pi", "Tom and Jerry", "John", "Alexandra");
        long countChr = listOfStr.stream()
                .mapToLong(s -> s.chars().filter(ch -> !Character.isWhitespace(ch)).count())
                .sum();
        System.out.println(countChr);

        System.out.println("-----------------");

        // 10. Given a list of employee objects with attributes: name, department, and salary;
        // find the department with the highest total salary.

        List<Employee> employees = List.of(new Employee("Alice", "Sales", 50000),
                new Employee("Bob", "IT", 75000),
                new Employee("Dave", "IT", 80000),
                new Employee("Charlie", "Sales", 60000),
                new Employee("Eve", "HR", 45000),
                new Employee("Frank", "IT", 90000),
                new Employee("Grace", "HR", 40000));

        Map<String, Integer> departmentTotalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.summingInt(Employee::getSalary)));

        String departmentWithHighestSalary = departmentTotalSalary.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("Unknown");

        System.out.println("Department with the highest salary is: " + departmentWithHighestSalary);

        System.out.println("---------------------");

        // 11. Given a list of products with attributes: name, category, and price;
        // find the category with the highest average price.

        List<Products> products = List.of(
                new Products("ring", "Jewelry", 1500),
                new Products("earrings", "Jewerly", 1700),
                new Products("necklace", "Jewerly", 2500),
                new Products("pencil", "Stationery", 10),
                new Products("pen", "Stationery", 12),
                new Products("eraser", "Stationery", 5)
        );

        Map<String, Double> categoryAveragePrice = products.stream()
                .collect(Collectors.groupingBy(Products::getCategory, Collectors.averagingDouble(Products::getPrice)));

        String categoryWithHighestPrice = categoryAveragePrice.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("Unknown");

        System.out.println("Category with the highest average price " + categoryWithHighestPrice);






    }
}

