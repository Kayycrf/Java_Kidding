import java.util.Scanner;

public class App {
    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while(true){
            System.out.print("\n 1. Show balance \n 2. Deposit \n 3. Withdraw \n 4. Exit \n What do you want to do? ");
            String action = scanner.nextLine();


            if(action.equals("1")){
                System.out.println(showBalance());
            }
            else if(action.equals("2")){
                System.out.println("How much do you want to deposite?");
                int action2 = scanner.nextInt();
                double action3 = (double) action2;
                System.out.println(deposite(action3));
            }
            else if(action.equals("3")){
                System.out.println("How much do you want to withdraw?");
                int action2 = scanner.nextInt();
                double action3 = (double) action2;
                withdraw(action3);
            }
            else if(action.equals("4")){
                System.out.println("Thanks for playing!");
                scanner.close();
                break;
            }

        }
        
    }

    static String showBalance(){
       return("Yor balance is " + balance);
    }

    static String deposite(double quant){
        balance += quant;
        return("You deposited " + quant);
    }

    static void withdraw(double quant){
        if(balance < quant){
           System.out.println("You don't have balance enough.");
        }
        else{
            balance -= quant;
            System.out.println("You withdrawed " + quant);
        }
        
    }

}

