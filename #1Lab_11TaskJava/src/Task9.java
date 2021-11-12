public class Task9 {
    public static void main(String[] args) {
        Kalkulator kalculator = new Kalkulator();
        System.out.println(kalculator.kalculateForInt(10,5,"/"));
        System.out.println(kalculator.kalculateForInt(12,5,"*"));
        System.out.println(kalculator.calculateForDouble(10.1, 5.1, "+"));
        System.out.println(kalculator.calculateForDouble(10.0, 0.5, "*"));
    }
}
