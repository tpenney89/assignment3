package tpenney;

/*
 * Generic class container that returns a value based on the type implemented
 */
public class GenericContainer<T> {
    private final T value;

    public GenericContainer(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
