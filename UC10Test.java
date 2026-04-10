import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC10Test {

    @Test
    void testTotalSeatCalculation() {
        List<UC10.Bogie> bogies = Arrays.asList(
                new UC10.Bogie("Sleeper", 72),
                new UC10.Bogie("AC Chair", 56));

        int result = UC10.totalCapacity(bogies);

        assertEquals(128, result);
    }

    @Test
    void testMultipleBogies() {
        List<UC10.Bogie> bogies = Arrays.asList(
                new UC10.Bogie("A", 10),
                new UC10.Bogie("B", 20),
                new UC10.Bogie("C", 30));

        int result = UC10.totalCapacity(bogies);

        assertEquals(60, result);
    }

    @Test
    void testSingleBogie() {
        List<UC10.Bogie> bogies = Arrays.asList(
                new UC10.Bogie("A", 50));

        int result = UC10.totalCapacity(bogies);

        assertEquals(50, result);
    }

    @Test
    void testEmptyList() {
        List<UC10.Bogie> bogies = new ArrayList<>();

        int result = UC10.totalCapacity(bogies);

        assertEquals(0, result);
    }

    @Test
    void testOriginalListUnchanged() {
        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("A", 10));

        UC10.totalCapacity(bogies);

        assertEquals(1, bogies.size());
    }
}