package Behavioral.Template.com.example.socialMedia;

import Behavioral.Template.com.example.network.Network;


public class Twitter extends Network {

    // Constructors
    // ----------------------------------------------------

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    // Abstract Methods
    // ----------------------------------------------------

    @Override
    public boolean logIn(String userNAme, String password) {

        System.out.println("Checking user's parameters");
        System.out.println("Name: " + userName);
        System.out.print("Password: ");

        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        simulateNetworkLatency();

        System.out.println("\n\nLogIn success on Twitter");

        return true;
    }

    @Override
    public boolean sendData(byte[] data) {

        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Twitter");
    }


    // Private Methods
    // ----------------------------------------------------

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 5) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
