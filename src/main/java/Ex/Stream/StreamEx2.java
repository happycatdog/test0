package Ex.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {

    public static void main(String[] args){
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> listStream = list.stream();

        Stream<String> stream = Stream.of("a","b","c");
        stream = Stream.of(new String[]{"a","b","c"});
        stream = Arrays.stream(new String[]{"a","b","c"});
        stream = Arrays.stream(new String[]{"a","b","c"}, 0,3);

        IntStream iStream = IntStream.range(4,10);

        stream = list.stream().filter(e -> e.contains("a"));
        stream = list.stream().map(e->e.toUpperCase());

        List<String> langList = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
        stream = langList.stream().sorted();
        stream = langList.stream().sorted(Comparator.reverseOrder());
        stream = langList.stream().distinct();

        stream.forEach(System.out::println);
        int sum = IntStream.of(1,2,3,4,5).peek(System.out::println).sum();

    }
}
