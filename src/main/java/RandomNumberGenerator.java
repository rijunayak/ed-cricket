import java.util.Random;

public class RandomNumberGenerator {

    private int maxNumber;

    public RandomNumberGenerator(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(maxNumber + 1);
    }
}
