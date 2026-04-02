import java.util.ArrayList;
import java.util.List;

public class UC1 {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");
        System.out.println();

        List<String> bogies = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + bogies.size());
        System.out.println("Current Train Consist : " + bogies);
        System.out.println();
        System.out.println("System ready for operations...");
    }
}
