package Ex.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args){
        String[] nameArr = {"IronMan","Captain","Hulk","Thor"};
        List<String> nameList = Arrays.asList(nameArr);

        Arrays.sort(nameArr);
        Collections.sort(nameList);

        for(String s: nameArr){
            System.out.println(s);
        }

        for(String s:nameList){
            System.out.println(s);
        }

        Stream<String> nameStream = nameList.stream();
        Stream<String> arrStream = Arrays.stream(nameArr);

        // Make -> Process -> Result
        Stream<String> myStream = nameList.stream().filter(s->s.contains("o")).map(String::toUpperCase).sorted();

        // Error - Stream Once
        //int count = nameStream.count();

        nameStream.sorted().forEach(System.out::println);
        arrStream.sorted().forEach(System.out::println);
        myStream.sorted().forEach(System.out::println);

    }
}
