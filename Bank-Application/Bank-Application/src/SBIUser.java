import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    //What are the attributes a bank Account should have.

    private String AccountNo;
    public String name;
    private int balance;

    private String password;

    private static float rateOfInterest;


    //constructor
    public SBIUser(String name, int balance,String password) {
        this.name = name;
        this.balance = balance;

        this.AccountNo = String.valueOf(UUID.randomUUID());

        this.password = password;
    }


    public String getAccountNo() {
        return AccountNo;
    }


    public int getBalance() {
        return balance;
    }



    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {

        balance = balance + money;

        return "Successfully added money "+money + " you new balance is "+balance;

    }

    @Override
    public String withDrawMoney(int money,String enteredPassword) {


        if(Objects.equals(enteredPassword, password)){

            if(money>balance){
                return "Kya kr rha bhai tu";
            }
            else{
                balance = balance - money;
                return "Money has been withdrawn "+money;
            }

        }else{
            return "Wrong password";
        }

    }

    @Override
    public float calculateInterest(int years) {


        float interest = balance*years*rateOfInterest/100;

        return interest;


    }
}
