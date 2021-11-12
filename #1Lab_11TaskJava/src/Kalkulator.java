public class Kalkulator {
    public double kalculateForInt (int a, int b, String operator) {
        if (operator == "+"){
            return a + b;
        }
        if (operator == "-"){
            return a - b;
        }
        if (operator == "/"){
            if (b == 0){
                System.out.println("Not null exception!");
            }
            return a / b;
        }
        if (operator == "*"){
            return a * b;
        }
        return 0;
    }
    public double calculateForDouble(double a, double b, String operator) {
        CustomDouble customDouble = new CustomDouble(a);
        CustomDouble customDouble1 = new CustomDouble(b);
        if (operator == "+") {
            return customDouble.Plus(customDouble1).toDouble();
        }
        if (operator == "-") {
            return customDouble.Minus(customDouble1).toDouble();

        }
        if (operator == "/") {
            if (b == 0) {
                System.out.println("Not null exception!");
            }
            return customDouble.Divide(customDouble1).toDouble();
        }
        if (operator == "*") {
            return customDouble.Increase(customDouble1).toDouble();
        }
        return 0;
    }
}
