package streams;

import java.time.Instant;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public class App {
    public static void main(String[] args) {

        System.currentTimeMillis();

        //counting occurrence of letters in string
        System.out.println(countingCharacterInString("tatekmohammedahmed"));


        //counting occurrence of elements in the list
        System.out.println(countingStringInStringArray(new String[]{"Jai", "Naren", "Nidhi",
                "Nidhi", "Naren", "Nidhi"}));


        /*working with filter,*/
        //Selecting elements in the collection, filter method is the best.
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);list.add(10);list.add(20);list.add(5);list.add(15);list.add(25);list.add(4);
        System.out.println(removingElementFromCollection(list));


        ArrayList <String> list1 = new ArrayList<>();
         Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };


        //with streams


        //working with mapping,
        //When we want modification of the data with the same element of the collection, we will use stream mapping method


        //working with flatmap
        //when we want multiple mapping in the stream,



        //working with distinct
        List<Integer> disList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Finding Distinct Elements "+disList);

    }

    private static List<Integer> removingElementFromCollection(ArrayList<Integer> list) {
        return list.stream()
                .filter(integer -> integer>5)
                .collect(Collectors.toList());
    }

    public static Map<Character,Long> countingCharacterInString(String name){

        //Inorder to work with stream, Converted char[] to Character[]
        Character[] myName = name.chars()
                .mapToObj(c ->(char)c)
                .toArray(Character[]::new);

        //Create stream and work in the stream.
        return Stream.of(myName)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    public static Map<String,Long> countingStringInStringArray(String[] nameList){
        System.out.printf("%f",( Instant.now()));
        return Arrays.stream(nameList)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
