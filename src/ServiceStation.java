public class ServiceStation implements Service {
    public static Transport[] transports = new Transport[6];

    @Override
    public void recordService(String name, int wheelsCount, String type) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                switch (type) {
                    case "Bicycle":
                        transports[i] = new Bicycle(name, wheelsCount);
                        System.out.println(name + " Записан на сервис");
                        break;
                    case "Car":
                        transports[i] = new Car(name, wheelsCount);
                        System.out.println(name + " Записан на сервис");
                        break;
                    case "Truck":
                        transports[i] = new Truck(name, wheelsCount);
                        System.out.println(name + " Записан на сервис");
                        break;
                }
                break;
            }
        }
    }

    public void deleteRecord(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transport.equals(transports[i])) {
                transports[i] = null;
            }
        }
    }

    @Override
    public void service(String name) {
        for (Transport transport : transports) {
            if (transport != null && (name == transport.getModelName())) {
                System.out.println("Обслуживаем " + transport.getModelName());
                if (transport instanceof Car) {
                    updateTyre(transport);
                    checkEngine();
                    deleteRecord(transport);
                }
                if (transport instanceof Bicycle) {
                    updateTyre(transport);
                    deleteRecord(transport);

                }
                if (transport instanceof Truck) {
                    updateTyre(transport);
                    checkEngine();
                    checkTrailer();
                    deleteRecord(transport);
                }
            }
        }
        System.out.println("----------------------------");
    }
    @Override
    public void service() {
        for (Transport transport : transports) {
            service(transport.getModelName());
        }
        System.out.println("----------------------------");
    }


    @Override
    public void updateTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}