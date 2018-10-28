
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkExample {

    public static void main(String... args) throws IOException {
        Path start = Paths.get("C:\\Users\\promod\\Desktop");
        Stream<Path> stream = Files.walk(start, 4, FileVisitOption.FOLLOW_LINKS);
        stream.forEach(System.out::println);
    }
}