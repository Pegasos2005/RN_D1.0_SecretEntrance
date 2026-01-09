package software.RN.org.model;

public record Rotation(char direction, int distance) {
    public static Rotation setRotation(String line) {
        return new Rotation(line.charAt(0), Integer.parseInt(line.substring(1)));
    }
}
