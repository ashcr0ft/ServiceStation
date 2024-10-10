public interface Service {

    void recordService(String name, int wheelsCount, String type);
    void service(String name);
    void service();
    void updateTyre(Transport transport) ;
    void checkEngine();
    void checkTrailer();


}
