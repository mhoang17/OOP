import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void withdrawTest(){

        BankAccount account = new BankAccount(200);

        int amount = 303;

        try{
            account.withdraw(amount);
        }catch (InsufficientFundsException e){
            System.out.println("You are short: " +e.getDeficit());
        }


    }

}