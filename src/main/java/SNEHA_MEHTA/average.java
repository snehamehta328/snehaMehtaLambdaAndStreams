package SNEHA_MEHTA;


import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class average {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        average(Stream.generate(scanner::nextDouble).
                limit(10).
                collect(Collectors.toList())).
                ifPresent(System.out::println);
    }

    private static OptionalDouble average(List<Double> list) {
        return list.
                stream().
                mapToDouble(value -> value).
                average();
    }
}
