import java.util.Stack;

public class CalculatorADT implements IStack<Integer> {
    private Stack<Integer> stack;

    public CalculatorADT() {
        stack = new Stack<>();
    }

    @Override
    public void push(Integer value) {
        stack.push(value);
    }

    @Override
    public Integer pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.pop();
    }

    @Override
    public Integer operation(char operator, Integer value1, Integer value2) {
        switch (operator) {
            case '+': return value1 + value2;
            case '-': return value1 - value2;
            case '*': return value1 * value2;
            case '/': 
                if (value2 == 0) throw new ArithmeticException("División por cero");
                return value1 / value2;
            default: throw new IllegalArgumentException("Operador no soportado: " + operator);
        }
    }



}
