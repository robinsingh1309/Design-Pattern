package Behavioral.Mediator.com.example.colleague;

public interface Colleague {

    /**
     * Send private message
     * 
     * @param to receiver who will receive the message
     * @param message message to be sent
     */
    void sendPrivateMessage(Colleague to, String message);

    /**
     * Send message to everyone
     * 
     * @param message message to be sent
     */
    void sendBrodcastMessage(String message);

    /**
     * Receive message
     * 
     * @param from message receive from the Colleague
     * @param message message that is sent
     */
    void receiveMessage(Colleague from, String message);
}
