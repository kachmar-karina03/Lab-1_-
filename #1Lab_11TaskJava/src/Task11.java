import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        Driver Ivan = new Driver("Ivan", "Petrovich", 440);
        List<Driver> drivers = new ArrayList<>();
        Car taxicar = new Car("Mazda5", drivers, 13);
        taxicar.addDriver(Ivan);
        Order order = new Order(21, 330);
        taxicar.getOrder(order);

    }
}
