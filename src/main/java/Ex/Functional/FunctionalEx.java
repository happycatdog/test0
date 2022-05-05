package Ex.Functional;

import java.util.Objects;

@FunctionalInterface
interface MyLamdaFunction{
    int max(int a, int b);
}

@FunctionalInterface
interface Supplier<T>{
    T get();
}

@FunctionalInterface
interface Consumer<T>{
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after){
        Objects.requireNonNull(after);
        return (T t) -> {accept(t); after.accept(t);};
    }
}

@FunctionalInterface
interface Function<T, R>{
    R apply(T t);

    default <V> Function<V, R> compose(Function<? super V, ? extends T> before){
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after){
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    static <T> Function<T,T> identity(){
        return t -> t;
    }
}
public class FunctionalEx {
    public static void main(String[] args){
        System.out.println(new MyLamdaFunction(){
            public int max(int a, int b){
                return a > b ? a : b;
            }
        }.max(1,2));

        MyLamdaFunction lamdaF = (int a, int b) -> a > b ? a : b;
        System.out.println(lamdaF.max(3,4));

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello World");

        Function<String, Integer> function = String::length;
        Function<String, String> function1 = (i) -> i.toString();
                //str -> str.length();
        function.apply("Hello World");
    }
}
