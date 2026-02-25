package Behavioral.Template.com.example.network;

public abstract class Network {

    // Fields

    protected String userName;
    protected String password;


    // Constructors
    // ---------------------------------------------------

    public Network() {
        // Nothing
    }


    // Methods
    // ---------------------------------------------------


    public boolean post(String message) {

        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());

            logOut();

            return result;
        }
        return false;
    }


    // Abstract Methods
    // ---------------------------------------------------

    public abstract boolean logIn(String userNAme, String password);

    public abstract boolean sendData(byte[] data);

    public abstract void logOut();


}
