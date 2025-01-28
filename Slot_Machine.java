import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //String [] slots = {"🔔", "🍉", "😺","🥕", "🪙", "👕"};
        double amount = 100;
        System.out.printf("\n Vamos jogar caça-níquel! Suas chances de vitória são de 19,9/100\n Valor em conta: R$%.2f", amount);
        
        String [] slots = {"A", "B", "C","D", "E", "F"};
        String [] game_slot = new String[3];
        int score = 0;

        Random rand = new Random();

        while(true){
            System.out.print("\n Quanto deseja apostar? ");
            double bet = scanner.nextDouble();

            while(bet > amount){
                System.out.printf("Você não tem saldo suficiente. Digite um valor entre R$0 e R$%.2f ", amount);
                bet = scanner.nextDouble();
            }

            if(bet <= amount){
                amount -= bet;
            }
            for(int i = 0; i < 3; i++){
                int index = rand.nextInt(0, 6);
                game_slot[i] = slots[index];
    
                System.out.print(game_slot[i] + " ");

    
                if(i == 2){
                    if(game_slot[0].equals(game_slot[1]) || game_slot[2].equals(game_slot[1]) || game_slot[2].equals(game_slot[0])){
                        amount += 1.5 * bet;
                    }
                    
                    if(game_slot[0].equals(game_slot[1]) && game_slot[2].equals(game_slot[1]) && game_slot[2].equals(game_slot[1])){
                        amount += 2 * bet;
                    }
        
                }
    
            }

            if(amount == 0){
                System.out.println("Seu saldo acabou. Ficou tudo para nós! Obrigado por jogar!");
                break;
            }

            System.out.printf("\n Valor adquirido: R$%.2f", bet = amount - 100);
            System.out.printf("\n Valor total: %.2f", amount);
            System.out.print("\n Quer continuar a jogar? ");
            String continue_play = scanner.next();
            continue_play = continue_play.toUpperCase();

            while(!continue_play.equals("S") && continue_play != ("N")){
                System.out.print("\n Digite 'S' para sim e 'N' para não: ");
                continue_play = scanner.next();
                continue_play = continue_play.toUpperCase();
            }

            if(continue_play.equals("N")){
                System.out.printf("Valor adquirido no total: R$%d", amount - 100);
                System.out.println("Obrigado por jogar!");
                break;
            }
        }

        System.out.println(score);
        scanner.close();

    }

}

