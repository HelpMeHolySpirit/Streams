import java.awt.Color;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        HashSet<Color> colors = new HashSet<>(Arrays.asList(Color.RED, Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW));
        System.out.println(colors);

        System.out.println("-------------------------------------");

        colors.parallelStream().forEach(color -> System.out.println(color));

        System.out.println("-------------------------------------");

        colors.stream().forEach(color -> System.out.println(color));

        System.out.println("-------------------------------------");

        colors.stream().forEach(System.out::println);

        System.out.println("-------------------------------------");

        Stream.generate(() -> 5).limit(3).forEach(x -> System.out.println("Generated: " + x));
    }
}
