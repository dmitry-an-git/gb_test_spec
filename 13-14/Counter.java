
public class Counter implements AutoCloseable {
    static int value = 0; // we use static variable that appends each time we create a new Counter object
    private boolean isOpen = false;

    public int add() {
        if (isOpen) {
            throw new IllegalStateException("Счетчик не закрыт!");
        }
        isOpen = true;  // if we are not closing the counter it will raise an error next time
        return ++value;
    }

    @Override
    public void close() {
        isOpen = false;
    }
    
    public int getValue() {
        return value;
    }
}

