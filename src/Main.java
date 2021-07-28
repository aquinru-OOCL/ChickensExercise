public class Main {
    public static void main(String[] args) {
        CalculatorInterface calculatorInterface = new ChickensImplement();
        calculatorInterface.calculate(100, 100, 5, 3, 1, 1, 1, 3);
    }
}
