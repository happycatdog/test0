package Ex.Functional;

import java.util.function.*;

@FunctionalInterface
interface Runnable {
     void run();
}

@FunctionalInterface
interface Callable<V> {
    V call() throws Exception;
}

public class FunctionalEx2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("runnable");
        };
        runnable.run();

        Callable<String> callable = () -> "callable";
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Supplier<Integer> supplier = () -> {
            Integer i = 3;
            return i * i;
        };
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (i) -> System.out.println("Consumer1 = " + i*i);
        Consumer<Integer> consumer2 = (i) -> System.out.println("Consumer2 = " + i*i);

        consumer.andThen(consumer2).accept(3);

        BiConsumer<Integer,Integer> biconsumer = (i,j) ->
                System.out.println("BiConsumer1 = i: " + i*i + " j:" + j*j);
        biconsumer.accept(3,4);

        Function<Integer, Integer> f1 = i -> {
            System.out.println("Inside F1");
            return i * i;
        };

        Function<Integer, Integer> f2 = i -> {
            System.out.println("Inside F2");
            return i * i;
        };

        System.out.println("And Then method");
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println("Compose method");
        System.out.println(f1.compose(f2).apply(2));

        Predicate<Integer> predicateA = a -> a % 2 == 0;
        Predicate<Integer> predicateB = b -> b % 3 == 0;

        boolean result = predicateA.and(predicateB).test(9);
        boolean result2 = predicateA.or(predicateB).test(9);
        boolean result3 = predicateA.negate().test(9);

        System.out.println(result + "," + result2 + ","+ result3);

        BiPredicate<Integer, String> biPredicate1 = (i, s) -> i.toString().equals(s);
        BiPredicate<Integer, String> biPredicate2 = (i, s) -> i.compareTo(Integer.valueOf(s)) > 0;

        System.out.println(biPredicate1.and(biPredicate2).test(2,"1"));
        System.out.println(biPredicate1.or(biPredicate2).test(2,"1"));

        UnaryOperator<Integer> divTwo = (i) -> i / 2;
        UnaryOperator<Integer> mulThree = (i) -> i * 3;
        int unaryresult = divTwo.andThen(mulThree).apply(4);

        BinaryOperator<Integer> binaryop = (i,j) -> i + j;
        int binaryopresult = binaryop.apply(10,10);


        BiFunction<Integer, String, Integer> bifunction = (i, s) -> i + Integer.valueOf(s);
        int bifresult = bifunction.apply(10, "10");

        System.out.println(unaryresult + "," + binaryopresult + ","+ bifresult);
    }
}
