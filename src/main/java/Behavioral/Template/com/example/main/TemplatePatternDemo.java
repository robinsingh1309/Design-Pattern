package Behavioral.Template.com.example.main;

import Behavioral.Template.com.example.network.Network;
import Behavioral.Template.com.example.socialMedia.Facebook;
import Behavioral.Template.com.example.socialMedia.Twitter;


public class TemplatePatternDemo {

    public static void main(String[] args) {

        Network network = null;

        /**
         * Just for simplicity, I am not taking input from the console so i am defining the dummy data for
         * username, password, message
         */
        String userName = "Robin";
        String password = "123456";

        String message = "Learned Template Design Pattern";

        System.out.println("\nChoose social network for posting message.\n" + 
                            "1 - Facebook\n" + 
                            "2 - Twitter"
                          );

        // just for demo purpose
        int choice = 1;

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else {
            network = new Twitter(userName, password);
        }
        
        network.post(message);
    }

}
