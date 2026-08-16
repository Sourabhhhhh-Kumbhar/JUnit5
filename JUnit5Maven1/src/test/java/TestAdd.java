import org.example.Add;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdd
{
    @Test
    public void testAdd()
    {
        Add add = new Add();

        int actualResult = add.add();

        assertEquals(20,20);
    }
}
