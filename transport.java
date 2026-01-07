package vehicle;



public class transport {

    void show() {
        System.out.println("This is a vehicle");
    }

    static class Car extends transport{
        void show() {
            System.out.println("This is a car");
        }
    }

    static class Ev extends transport {
        void show() {
            System.out.println("This is an EV car");
        }
    }

    public static void main(String[] args) {
        transport v = new transport();
        transport w = new Car();
        transport x = new Ev();

        v.show();
        w.show();
        x.show();
    }
}