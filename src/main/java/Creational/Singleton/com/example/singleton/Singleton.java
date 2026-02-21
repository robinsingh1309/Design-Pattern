package Creational.Singleton.com.example.singleton;


public class Singleton {

    // Fields

    private static Singleton instance;
    public final String value;


    // Constructor
    // ------------------------------------------------

    private Singleton(final String value) {
        this.value = value;
    }


    // Methods
    // ------------------------------------------------

    public static Singleton getInstance(final String value) {

        if (instance == null) {
            instance = new Singleton(value);
        }

        return instance;
    }

    /**
     * for making it more thread safe
     */
    public static Singleton getThreadSafeInstance(final String value) {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }

        return instance;
    }


}
