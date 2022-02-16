package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tatek Ahmed on 2/16/2022
 **/

public class App {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        list.add(0);list.add(10);list.add(20);list.add(5);list.add(15);list.add(25);
        list1.add("Sarina");list1.add("Sabrina");list1.add("Tatek");list1.add("Ahmed");

        //without streams
        List<Integer> l1 = new ArrayList<>();
        for (Integer i:list) {
            if (i%2 ==0)
                l1.add(i);
        }
        System.out.println(l1);

        //with streams
        List<Integer> listStream1 = list.stream().filter(l -> l%2 ==0).collect(Collectors.toList());
        System.out.println(listStream1);

        //without streams
        List<Integer> l2 = new ArrayList<>();
        for (Integer i:list) {
                l2.add(i*2);
        }
        System.out.println(l2);

        //with streams
        List<Integer> listStream2 = list.stream().map(l -> l*2).collect(Collectors.toList());
        System.out.println(listStream2);

        //working with filter
        List<String> listStream3 = list1.stream().filter(l -> l.length()>5).collect(Collectors.toList());
        System.out.println(listStream3);

        //working with mapping
        List<String> listStream4 = list1.stream().map(l -> l.toUpperCase()).collect(Collectors.toList());
        System.out.println(listStream4);

        //working with collect
        long listStream5 = list1.stream().filter(l -> l.length()>5).count();
        System.out.println(String.format("Greater than 5 letters we found %d item/s ",listStream5));
    }
}
