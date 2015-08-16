/**
 * Created by San on 8/16/15.
 */
public class Main {

    public static void main(String... args) {
        Main m = new Main();
        m.run(m::sayHello);
    }

    private void sayHello() {
        System.out.println("Hello, lambda");
    }

    public void run(Runnable r) {
        r.run();
    }
}
