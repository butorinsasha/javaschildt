package book.chapter12enums_autoboxing_staticimport_annotations;

public enum Ch12p411Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed for each transport

    // enum constructor
    Ch12p411Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
