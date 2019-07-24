import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

class RandomNumberGeneratorTest {

    @Test
    void get_random_number_within_zero_and_max_number() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(8);
        for(int i = 0; i < 100; i++) {
            assertThat(randomNumberGenerator.randomNumber(), greaterThanOrEqualTo(0));
            assertThat(randomNumberGenerator.randomNumber(), lessThanOrEqualTo(8));
        }
    }
}