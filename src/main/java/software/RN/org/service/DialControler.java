package software.RN.org.service;

import software.RN.org.model.Rotation;
import software.RN.org.model.RotationList;

public class DialControler {
    private int dial;

    public DialControler(int dial) {
        this.dial = dial;
    }

    public long countMovsEndsInZero(RotationList rotationList) {
        long count = 0;
        for (int r = 0; r < rotationList.getRows(); r++) {
            moveDialCountZero(rotationList.getRotation(r));
            if (dial == 0) count++;
        }
        return count;
    }

    public void moveDialCountZero(Rotation rotation) {
        for (int i = 0; i < rotation.distance(); i++) {
            if (rotation.direction() == 'R') {
                dial++;
            } else {
                dial--;
            }

            // Revisamos el desbordamiento
            if (dial > 99) {
                dial = 0;
            } else if (dial < 0) {
                dial = 99;
            }
        }
    }
}
