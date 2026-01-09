package software.RN.org.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Reader {
    public static List<String> readLines(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            return lines.toList();
        }
    }
}
