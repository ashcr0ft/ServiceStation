import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service records = new ServiceStation();

        records.recordService("Аист", 2, "Bicycle");
        records.recordService("Дружок", 2, "Bicycle");
        records.recordService("Ваз 2109", 4, "Car");
        records.recordService("Ford Focus", 4, "Car");
        records.recordService("DAF XF", 6, "Truck");
        records.recordService("Камаз", 8, "Truck");

        records.service();
        records.recordService("Камаз", 8, "Truck");

        records.service("Камаз");

    }
}