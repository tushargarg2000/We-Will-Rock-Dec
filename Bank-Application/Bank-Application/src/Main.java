import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name and initial balance and password ");

        String name = sc.nextLine();
        int balance = sc.nextInt();

        String password = sc.nextLine();


        //Creation of the account has happened
        SBIUser acc1 = new SBIUser(name,balance,password);

        System.out.println("The account of new SBI Account is"+acc1.getAccountNo());


        //add money
        System.out.println("Enter the money that you want to addd ");
        int money = sc.nextInt();

        acc1.addMoney(money);

        //Check balance

        int newBalance = acc1.getBalance();

        System.out.println("The new balance is "+newBalance);


        //Withdraw money

        System.out.println("Withdraw money");

        int amt = sc.nextInt();
        System.out.println("Enter the password");

        String enteredPassword = sc.next();
        String result = acc1.withDrawMoney(amt,enteredPassword);
        System.out.println(result);


    }
}