import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

            Car car = new Car("Лада",4);


            Truck truck = new Truck( "Камаз",8);


            Bicycle bicycle = new Bicycle("Кама", 2);


            ServiceStation station = new ServiceStation();
            station.check(car);
            System.out.println();
            station.check(bicycle);
            System.out.println();
            station.check(truck);
    }
}