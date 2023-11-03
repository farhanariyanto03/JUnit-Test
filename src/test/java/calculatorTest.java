import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    calculator cal = new calculator();

    @org.junit.jupiter.api.Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, cal.add(2, 2));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }
}