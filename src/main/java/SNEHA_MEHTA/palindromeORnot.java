package SNEHA_MEHTA;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class palindromeORnot {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        palindromes(Stream.generate(scanner::nextLine).
                limit(10).
                collect(Collectors.toList())).
                forEach(System.out::println);
    }

    private static List<String> palindromes(List<String> list) {
        return list.
                stream().
                filter(str -> new StringBuilder(str).reverse().toString().equals(str)).
                collect(Collectors.toList());
    }
}
