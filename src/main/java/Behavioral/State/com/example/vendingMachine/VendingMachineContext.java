package Behavioral.State.com.example.vendingMachine;

import java.util.HashMap;
import java.util.Map;

import Behavioral.State.com.example.vendingMachine.state.AcceptCoinState;
import Behavioral.State.com.example.vendingMachine.state.DispenseState;
import Behavioral.State.com.example.vendingMachine.state.SelectionState;
import Behavioral.State.com.example.vendingMachine.state.VendingMachineState;


public class VendingMachineContext {

    // Fields

    private VendingMachineState state;

    // States
    private final VendingMachineState acceptCoinState;
    private final VendingMachineState selectionState;
    private final VendingMachineState dispenseState;


    private int totalAmount;
    private Map<Integer, Integer> products; // productCode -> productPrice


    // Constructors
    // --------------------------------------------------

    public VendingMachineContext() {
        this.acceptCoinState = new AcceptCoinState();
        this.selectionState = new SelectionState();
        this.dispenseState = new DispenseState();

        this.state = acceptCoinState;

        this.totalAmount = 0;
        this.products = new HashMap<Integer, Integer>();
    }


    // Delegation Methods
    // --------------------------------------------------

    public void insertCoin(int coin) {
        state.insertCoin(this, coin);
    }

    public void selectProduct(int productCode) {
        state.selectProduct(this, productCode);
    }

    public void addAmount(int coin) {
        totalAmount += coin;
    }

    // Business Methods
    // --------------------------------------------------

    public int getTotalAmount() {
        return totalAmount;
    }

    public void resetAmount() {
        totalAmount = 0;
    }

    public void addProduct(int productCode, int price) {
        products.put(productCode, price);
    }

    public int getProductPrice(int productCode) {
        return products.getOrDefault(productCode, -1);
    }


    // Getters and Setters
    // --------------------------------------------------

    public VendingMachineState getAcceptCoinState() {
        return acceptCoinState;
    }

    public VendingMachineState getSelectionState() {
        return selectionState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseState;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

}
