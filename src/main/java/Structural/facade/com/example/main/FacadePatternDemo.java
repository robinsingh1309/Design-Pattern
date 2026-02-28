package Structural.facade.com.example.main;

import Structural.facade.com.example.facade.BankFacade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        
        BankFacade facade = new BankFacade();
        
        facade.getAccountDetails("12345");
        facade.transferFunds("12345", "98745", 100.00);
        facade.payBill("12345", "CixcAg157", 980.10);

    }

}
