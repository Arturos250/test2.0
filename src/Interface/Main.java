package Interface;

public class Main {
    public static void main(String[] args) {
        Audi audi_R8 = new Audi();
        BMW bmw_X4 = new BMW();
        Hyundai hyundai_I30 = new Hyundai();

        audi_R8.drive();
        bmw_X4.drive();
        hyundai_I30.drive();
    }
}
