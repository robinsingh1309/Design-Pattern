package Structural.facade.com.example.facade;

import Structural.facade.com.example.service.AccountService;
import Structural.facade.com.example.service.BillPaymentService;
import Structural.facade.com.example.service.TransferService;


public class BankFacade {

    private AccountService accountService;
    private TransferService transferService;
    private BillPaymentService billPaymentService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.transferService = new TransferService();
        this.billPaymentService = new BillPaymentService();
    }

    public void getAccountDetails(String accountId) {
        accountService.getAccountDetails(accountId);
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        transferService.transferFunds(fromAccount, toAccount, amount);
    }

    public void payBill(String accountId, String billId, double amount) {
        billPaymentService.payBill(accountId, billId, amount);
    }

}
