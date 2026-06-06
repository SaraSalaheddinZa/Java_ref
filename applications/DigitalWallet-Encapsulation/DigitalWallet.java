public class DigitalWallet {
    private int cashbackPoints;
    private double balance;
    private String holderName;

    public int getCashbackPoints(){
        return cashbackPoints;
    }
    public void setCashbackPoints(int points){
        if (points >= 0){
            this.cashbackPoints = points;
            System.out.println("Valid Points!");
        } else {
            System.out.println("Invalid points!");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance (double newBalance){
        if (newBalance >= 0){
            this.balance = newBalance;
            System.out.println("Valid Balance!");
        } else {
            System.out.println("Invalid Balance!");
        }
    }

    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.holderName = name;
            System.out.println("Valid Name!");
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Successfully deposited: " + amount + "SAR");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void spend(double amount){
        if (amount > 0 && balance >= amount){
            this.balance -= amount;
            this.cashbackPoints += 10;
        }
    }
}
