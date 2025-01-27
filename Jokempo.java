import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos jogar pedra, papel, tesoura!\n");

        String [] options = {"Pedra", "Papel", "Tesoura"};



        Scanner scanner = new Scanner(System.in);

        //Aleatory choose by the  computer
        Random rand = new Random();
        int comp_c = rand.nextInt(0,2);
        String comp_cf = options[comp_c];

        while(true){
            System.out.println("\n 1 - Pedra \n 2 - Papel \n 3 - Tesoura");
            System.out.print("\n Vamos lá, você começa!: ");
            int player_move = scanner.nextInt();
            System.out.printf("\n O computador escolheu %s", comp_cf);

            if(comp_cf.equals("Pedra")){
                if(player_move == 1){
                    System.out.println("\n Ufa! Isoo foi um empate.");
                }
                else if(player_move == 2){
                    System.out.println("\n Boa! Você venceu!");
                }
                else if(player_move == 3){
                    System.out.println("\n Ufa! Isoo foi um empate");
                }
            }

            if(comp_cf.equals("Papel")){
                if(player_move == 1){
                    System.out.println("\n Que pena! Você perdeu.");
                }
                else if(player_move == 2){
                    System.out.println("\n Ufa! Isoo foi um empate");
                }
                else if(player_move == 3){
                    System.out.println("\n Boa! Você venceu!");
                }
            }

            else if(comp_cf.equals("Tesoura")){
                if(player_move == 1){
                    System.out.println("\n Boa! Você venceu!");
                }
                else if(player_move == 2){
                    System.out.println("\n Que pena! você perdeu.");
                }
                else if(player_move == 3){
                    System.out.println("\n Ufa! Isoo foi um empate");
                }
            }

            System.out.print("\n Você quer jogar de novo?");
            String  player_again = scanner.next();
            player_again = player_again.toUpperCase();
            if(player_again.charAt(0) == 'N'){
                System.out.println("Obrigado por jogar!");
                break;
            }
        }

        scanner.close();

    }

}

