package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public class App {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();

         Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };


        list.add(0);list.add(10);list.add(20);list.add(5);list.add(15);list.add(25);
        list.add(0);list.add(10);list.add(20);list.add(5);list.add(15);list.add(25);

        list1.add("Sarina");list1.add("Sabrina");list1.add("Tatek");list1.add("Ahmed");


        //with streams


        /*working with filter,*/
        //when we do not want elements of the collection, we will use filter method.
        List<String> listStream3 = list1.stream().filter(l -> l.length()>5).collect(Collectors.toList());
        System.out.println(listStream3);

        List<Integer> listStream1 = list.stream().filter(l -> l%2 ==0).collect(Collectors.toList());
        System.out.println(listStream1);

        //working with mapping,
        //When we want modification of the data with the same element of the collection, we will use stream mapping method
        List<String> listStream4 = list1.stream().map(l -> l.toUpperCase()).collect(Collectors.toList());
        System.out.println(listStream4);

        //working with flatmap
        //when we want multiple mapping in the stream,

        List<Integer> listStream2 = list.stream().map(l -> l*2).collect(Collectors.toList());
        System.out.println(listStream2);

        //working with collect
        long listStream5 = list1.stream().filter(l -> l.length()>5).count();
        System.out.println(String.format("Greater than 5 letters we found %d item/s ",listStream5));

        //working with distinct
        List<Integer> disList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(disList);

        //function.identity
//        Map<String, List<String >> idList = list1.stream().sorted().collect(Collectors)
//        System.out.println(idList);
    }
}
