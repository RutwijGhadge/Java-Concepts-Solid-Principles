package Stream_APIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Stream can be defined as sequence of elements supporting aggregate operations
In other words, Stream are sequence of elements from source like Collection/Arrays
for data processing like filtering, sorting, counting, finding, iterating, etc.
These data processing can be operated/executed in sequential or parallel mode
Stream support ordering in compliant with source provided like for example if the
source is ArrayList which maintains insertion order so Stream preserves this order even after processing
Note: Stream aren’t Collection, Stream only does processing on Collection
 */
public class StreamAPI {
    public static void main(String[] args) {
        //sorting odd Numbers from Collection: Array
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);//Sorting Odd Numbers
        List<Integer> streams = list.
                stream().
                filter(i -> i % 2 != 0).sorted().collect(Collectors.toList());
        streams.forEach(i -> System.out.println(i));


        //Stream example to get String with length greater than 5 from List of Strings
        List<String>lists=Arrays.asList("Sachin","Saurabh","Prem","Roy","Anvit");
        List<String> pqr=lists
                .stream()
                .filter(s-> s.length()>5)
                .collect(Collectors.toList());
        pqr.forEach(s->System.out.println(s));


        List<Integer>abc=list
                .stream()
                .map(i->i*i)
                .collect(Collectors.toList());
        abc.forEach(i->System.out.println(i));

        //Combination of Filter and Map
        List<String> names = new ArrayList<>();
        // add few names to String list using add() method
        names.add("Sachin");
        names.add("Warne");
        names.add("Pietersen");
        names.add("McCullum");
        names.add("Jonty");
        names.add("Richards");
        names.add("Ranatunga");

        List<String>ghj=names
                .stream()
                .filter(s->s.length()>5)//filter out the elements that matches the given condition
                .map(s->s.toUpperCase())//mapping the elements with the condition
                .collect(Collectors.toList());//collecting the converted elements
        ghj.forEach(s->System.out.println(s));//printing the elements from the ghj list
    }
}
