public class Main {
    public static void main(String[] args) {
        DigitalWallet digitalWallet = new DigitalWallet();
        System.out.println("Wrong Data");
        digitalWallet.setHolderName(" ");
        digitalWallet.setBalance(-1000.0);
        digitalWallet.setCashbackPoints(-9);

        System.out.println("Right Data");
        digitalWallet.setBalance(1000.0);
        digitalWallet.setCashbackPoints(9);
        digitalWallet.setHolderName("sara");

        System.out.println("---Deposit---");
        digitalWallet.deposit(500.0);

        System.out.println("---Spend---");
        digitalWallet.spend(300.0);

        System.out.println("\n--- Final Wallet Report ---");
        System.out.println("Holder Name: " + digitalWallet.getHolderName());
        System.out.println("Current Balance: " + digitalWallet.getBalance() + " SAR");
        System.out.println("Cashback Points: " + digitalWallet.getCashbackPoints());
    }
}
