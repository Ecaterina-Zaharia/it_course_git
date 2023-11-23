import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListOfIntegers listOfIntegers = (list) -> {
            List<Integer> result = new ArrayList<>();
            for(int num : list){
                if(num %2 !=0){
                    result.add(num);
                }
            }
            return result;
        };

        List<Integer> oddList = listOfIntegers.transform(numbers);
        System.out.println("Odd numbers " + oddList);
    }

}

interface ListOfIntegers{
    List<Integer> transform(List<Integer> input);
}