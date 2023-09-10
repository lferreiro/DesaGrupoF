
import desagrupof.validators.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("ValidPassword123!", null));
    }

    @Test
    public void testInvalidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("weak", null));
    }
}
