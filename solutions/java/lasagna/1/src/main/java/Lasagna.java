public class Lasagna {
    private final int EXPECTED_TIME = 40;
    private final int TIME_TO_PREPARE_ONE_LAYER = 2;
    private int remainingTime;
    private int preparationTime;
    private int totalTime;

    public Lasagna() {
    }

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_TIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTime) {
        return remainingTime = EXPECTED_TIME - actualTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return preparationTime = layers * TIME_TO_PREPARE_ONE_LAYER;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualTime) {
        return totalTime = preparationTimeInMinutes(layers) + actualTime;
    }
}
