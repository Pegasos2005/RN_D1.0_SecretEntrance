package software.RN.org.model;

import java.util.List;

public class RotationList {
    private final Rotation[] rotations;
    private final int rows;

    // Constructor privado: Solo se puede llamar desde dentro
    private RotationList(Rotation[] rotations) {
        this.rotations = rotations;
        this.rows = rotations.length;
    }

    // Crear constructores de manera profesional: Static Factory Method
    public static RotationList fromRawLines(List<String> lines) {
        Rotation[] rotationList = lines.stream()
                .map(Rotation::setRotation)
                .toArray(Rotation[]::new);

        return new RotationList(rotationList);
    }

    public Rotation getRotation(int row) {
        return rotations[row];
    }

    public int getRows() {
        return rows;
    }
}