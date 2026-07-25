public class Lasagna {
    private final int TIME_TO_PREPARE_ONE_LAYER = 2;

    public Lasagna() {
    }

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualTime) {
        return expectedMinutesInOven() - actualTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * TIME_TO_PREPARE_ONE_LAYER;
    }

    public int totalTimeInMinutes(int layers, int actualTime) {
        return preparationTimeInMinutes(layers) + (expectedMinutesInOven() - remainingMinutesInOven(actualTime));
    }
}
