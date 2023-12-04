import com.example.ColourTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ColourTableTest {
    @Test
    void testValidConstructor() {
        assertDoesNotThrow(() -> new ColourTable(8));
    }
    @Test
    void testConstructorInvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(3));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1025));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable());
    }
}
