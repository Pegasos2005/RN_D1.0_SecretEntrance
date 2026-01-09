package software.RN.org;

import software.RN.org.io.Reader;
import software.RN.org.model.RotationList;
import software.RN.org.service.DialControler;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    private static final Path INPUT_PATH = Path.of("src", "main", "resources", "input.txt");

    public static void main(String[] args) {
        try {
            var lines = Reader.readLines(INPUT_PATH);

            var numberList = RotationList.fromRawLines(lines);

            int dial = 50;
            System.out.println("Nº d veces acabadas en 0: " + DialControler.countMovsEndsInZero(numberList, dial));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
