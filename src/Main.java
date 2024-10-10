public class Main {
    public static void main(String[] args) {
        Service service = new ServiceStation();
        Car car = new Car("car1", 4);
        Car car2 = new Car("car1", 4);
        Bicycle bicycle = new Bicycle("bicycle", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Truck truck = new Truck("truck", 6);
        Truck truck2 = new Truck("truck2", 8);

        service.doService(bicycle);
        service.doService(bicycle2);
        service.doService(car);
        service.doService(car2);
        service.doService(truck);
        service.doService(truck2);

    }
}