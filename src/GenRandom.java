import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

class IntMaker implements IntSupplier {
    Random randSrc = new Random();

    public int getAsInt(){
        return randSrc.nextInt();
    }


}
public class GenRandom{
    public static void main(String[] args) {
        IntStream.generate(new IntMaker()).limit(5).forEach(number -> System.out.println(number));

        System.out.println("----------------------------------");

        IntStream.iterate(1, i -> i + 1).limit(7).forEach(System.out::println);
    }
}