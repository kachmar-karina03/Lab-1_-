public class Task8 {
    public static void main(String[] args) {
        CustomDouble customDouble0 = new CustomDouble(3, 0.7);
        CustomDouble customDouble1 = new CustomDouble(2, 0.3);
        CustomDouble customDouble2 = new CustomDouble(2, 0.3);


        System.out.println("First = " + customDouble0);
        System.out.println("Second = " + customDouble1);
        System.out.println("Third = " + customDouble2);


        System.out.println("Sum of first and second numbers= " + customDouble0.Plus(customDouble1));
        System.out.println("Difference first and second numbers= " + customDouble0.Minus(customDouble1));



        System.out.println("Compare first and second: ");
        customDouble0.Compare(customDouble1);
        System.out.println("Compare second and third: ");
        customDouble1.Compare(customDouble2);


        System.out.println(customDouble0.equals(customDouble1));
        System.out.println(customDouble1.equals(customDouble2));
        System.out.println(customDouble0.hashCode());
        System.out.println(customDouble1.hashCode());
        System.out.println(customDouble2.hashCode());
    }
}
