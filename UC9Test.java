import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC9Test {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<UC9.Bogie> bogies = Arrays.asList(
                new UC9.Bogie("Sleeper", 72),
                new UC9.Bogie("Sleeper", 70));

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentTypes() {
        List<UC9.Bogie> bogies = Arrays.asList(
                new UC9.Bogie("Sleeper", 72),
                new UC9.Bogie("AC Chair", 60));

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyList() {
        List<UC9.Bogie> bogies = new ArrayList<>();

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<UC9.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC9.Bogie("Sleeper", 72));

        UC9.groupBogies(bogies);

        assertEquals(1, bogies.size());
    }
}