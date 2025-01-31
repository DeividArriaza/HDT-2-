import org.junit.Test;
import org.junit.Assert;

public class CalculatorADTTest {
    @Test
    public void testOperation() {
        CalculatorADT calc = new CalculatorADT();
        int resultado = calc.operation('+', 5, 8);
        Assert.assertEquals(13, resultado);
    }
    
    @Test
    public void testOperation1() {
        CalculatorADT calc = new CalculatorADT();
        int resultado = calc.operation('-', 10, 8);
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testOperation2() {
        CalculatorADT calc = new CalculatorADT();
        int resultado = calc.operation('*', 10, 8);
        Assert.assertEquals(80, resultado);
    }

    @Test
    public void testOperation3() {
        CalculatorADT calc = new CalculatorADT();
        int resultado = calc.operation('/', 10, 5);
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testEvaluatePostfix() {
        CalculatorADT calc = new CalculatorADT();
        int resultado = calc.evaluatePostfix("1 2 + 4 * 3 +");
        Assert.assertEquals(15, resultado);
    }


}
