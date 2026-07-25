public class Lasagna {
    private final int EXPECTED_TIME = 40;
    private final int TIME_TO_PREPARE_ONE_LAYER = 2;

    public Lasagna() {
    }

    public int expectedMinutesInOven() {
        return this.EXPECTED_TIME;
    }

    public int remainingMinutesInOven(int actualTime) {
        return EXPECTED_TIME - actualTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * TIME_TO_PREPARE_ONE_LAYER;
    }

    public int totalTimeInMinutes(int layers, int actualTime) {
        return preparationTimeInMinutes(layers) + (EXPECTED_TIME - remainingMinutesInOven(actualTime));
    }
}
