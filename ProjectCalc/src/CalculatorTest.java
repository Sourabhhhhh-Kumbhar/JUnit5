import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    Calculator calc = new Calculator();

    @Test
    void Addition()
    {
        int a = 10;
        int b = 10;
        int result = calc.add(a, b);
    }

    @Test
    void Subtraction()
    {
        int a = 10;
        int b = 10;
        int result = calc.sub(a , b);
    }

    @Test
    void Multiplication()
    {
        int a = 10;
        int b = 10;
        int result = calc.mul(a , b);
    }

    @Test
    void Division()
    {
        int a = 10;
        int b =10;
        int result = calc.div(a, b);
    }

}