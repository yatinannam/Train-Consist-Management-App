import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC8Test {

    @Test
    void testGreaterThanThreshold() {
        List<UC8.Bogie> bogies = Arrays.asList(
                new UC8.Bogie("A", 80),
                new UC8.Bogie("B", 60));

        List<UC8.Bogie> result = UC8.filterBogies(bogies, 70);

        assertEquals(1, result.size());
    }

    @Test
    void testNoMatch() {
        List<UC8.Bogie> bogies = Arrays.asList(
                new UC8.Bogie("A", 50),
                new UC8.Bogie("B", 60));

        List<UC8.Bogie> result = UC8.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }
}