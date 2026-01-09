package software.RN.org.service;

import software.RN.org.model.Rotation;
import software.RN.org.model.RotationList;

public class DialControler {
    public static long countMovsEndsInZero(RotationList rotationList, int dial) {
        long count = 0;
        for (int r = 0; r < rotationList.getRows(); r++) {
            dial = moveDial(dial, rotationList.getRotation(r));
            System.out.println("Dial: " + dial);
            if (dial == 0) count++;
        }
        return count;
    }

    public static int moveDial(int dial, Rotation rotation) {
        if (rotation.direction() == 'R') dial += rotation.distance();
        else if (rotation.direction() == 'L') dial -= rotation.distance();
        return dial%100;
    }
}
