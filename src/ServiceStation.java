public class ServiceStation implements Service {

    @Override
    public void doService(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        updateTyre(bicycle);
    }

    @Override
    public void doService(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        updateTyre(car);
        checkEngine();
    }

    @Override
    public void doService(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        updateTyre(truck);
        checkEngine();
        checkTrailer();
    }

    public void updateTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}