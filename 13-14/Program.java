
/**
 * Main
 */

public class Program {

    public static void main(String[] args) {

        // try (Counter counter = new Counter()) {
        //     counter.add();
        //     System.out.println(counter.value); // выведет 1
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // Counter badCounter = new Counter();
        // badCounter.add();  // это приведет к исключению, так как ресурс не был закрыт
        // System.out.println(badCounter.value);


        Presenter presenter = new Presenter();
        presenter.run();
    }
}