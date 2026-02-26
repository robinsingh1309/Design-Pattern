package Behavioral.ChainOfResponsibility.com.example.request;


public class Request {

    // Fields

    private final String user;
    private final String userRole;
    private final int requestCount;
    private final String payload;


    // Constructors
    // -------------------------------------------------------------------------

    public Request(String user, String userRole, int reqCount, String payLoad) {
        this.user = user;
        this.userRole = userRole;
        this.requestCount = reqCount;
        this.payload = payLoad;
    }


    // Getters
    // -------------------------------------------------------------------------

    public String getUser() {
        return user;
    }

    public String getUserRole() {
        return userRole;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public String getPayload() {
        return payload;
    }

}
