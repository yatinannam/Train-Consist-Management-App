import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UC15Test {

    // ✔ Safe Assignment Test
    @Test
    void testCargo_SafeAssignment() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    // ✔ Unsafe Assignment Handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // Should NOT assign cargo
        assertNull(bogie.getCargo());
    }

    // ✔ Cargo Not Assigned After Failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    // ✔ Program Continues After Exception
    @Test
    void testCargo_ProgramContinuesAfterException() {
        UC15.GoodsBogie bogie1 = new UC15.GoodsBogie("Rectangular");

        UC15.GoodsBogie bogie2 = new UC15.GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum"); // unsafe
        bogie2.assignCargo("Coal"); // safe

        assertEquals("Coal", bogie2.getCargo());
    }

    // ✔ Finally Block Execution (Indirect Check)
    @Test
    void testCargo_FinallyBlockExecution() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");

        // If no crash → finally executed
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}