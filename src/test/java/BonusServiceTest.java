import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void calculateAssertion(long amount, boolean registered, int expection) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expection, actual);
    }
}