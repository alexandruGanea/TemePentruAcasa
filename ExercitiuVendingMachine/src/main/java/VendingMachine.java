public class VendingMachine {

    private int userFunds;
    private static final VendingMachine instance = new VendingMachine();
    private VendingMachine() {
    }

    public static VendingMachine getInstance() {
        return instance;
    }

    public int getUserFunds() {
        return userFunds;
    }

    public void setUserFunds(int userFunds) {
        this.userFunds = userFunds;
    }
}
