import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String str = "Hello world from Vovchik";
        Stream<String> ss = Stream.of(str.split(" "));
        List<String> ls = ss.collect(Collectors.toList());
        System.out.println(ls);
    }
}
