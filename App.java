import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Vamos jogar um jogo de adivinhação?");
        int lives = 4;
        Scanner scanner = new Scanner(System.in);
        String answ = scanner.nextLine();
        answ = answ.toUpperCase();

        while (answ.charAt(0) != 'S' && answ.charAt(0) != 'N') {
            System.out.print("Vamos jogar um jogo de adivinhação?");
            answ = scanner.nextLine();
            answ = answ.toUpperCase();
        }
    
        if (answ.charAt(0) == 'S') {
            System.out.printf("Então vamos começar! Digite um número entre 0 e 15, você tem %d chances para adivinhar o que o computador está pensando. \n", lives);
            Random rand = new Random();
            int comp = rand.nextInt(15);

            while (true) {
                System.out.print("Chute um número: ");
                int guess = Integer.parseInt(scanner.nextLine());


                if (guess > comp) {
                    System.out.println("Chute mais baixo!");
                    lives -= 1;
                }

                else if (guess < comp) {
                    System.out.println("Chute mais alto!");
                    lives -= 1;
                }

                else if (guess == comp) {
                    System.out.println("Parabéns! Você acertou!");
                    break;
                }

                if (lives == 0) {
                    System.out.println("Que pena, você perdeu! :(");
                    break;
                }
                
            }

        }

        else if (answ.charAt(0) == 'N') {
            System.out.println("Tudo bem, tenha um bom dia");
        }

        scanner.close();
    }
}