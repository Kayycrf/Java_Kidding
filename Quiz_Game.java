import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        //Array of questions
        String [] questions = {"\n [FÁCIL] \n  1 - Qual o maior campeão do Brasileirão?", "\n [FÁCIL] \n 2 - Qual estado brasileiro possui mais títulos internacionais?", "\n [FÁCIL] 3 - \n Qual o time carioca com mais títulos oficiais?", "\n [MÉDIA] 4- Qual desses times não possui 3 libertadores?","\n [DIFÍCIL] \n 5 - Qual foi foi o segundo campeão do brasileirão? "};
        //Array of options
        String [] options = {
            "\n a. Flamengo \n b. Palmeiras \n c. São Paulo \n d. Corinthians \n e. Grêmio", 
            "\n a. Bahia \n b. Rio Grande do Sul \n c. São Paulo \n d. Rio de Janeiro \n e. Minas Gerais",
            "\n a. Botafogo \n b. Flamengo \n c. Vasco \n d. Fluminense \n e. Bangu",
            "\n a. Grêmio \n b. Santos \n c. Vasco \n d. Flamengo \n e. São Paulo",
            "\n a. Sport \n b. Internacional \n c. Atlético Mineiro \n d. Bahia \n e. Mirassol"
        };
        
        
        System.out.println("Vamos jogar um quiz! Vamos para as questões: ");

        for(int i = 0; i < 5; i++){
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("\n Resposta: ");
            String answ = scanner.next();

            switch(i){
                case 0:
                    if(answ.equals("b")){
                        System.out.println("\n Você acertou!");
                        score++;
                        break;
                    }
                    else{
                        System.out.println("\n Você errou :(");
                        break;
                    }
                case 1:
                    if(answ.equals("c")){
                        System.out.println("\n Você acertou!");
                        score++;
                         break;
                    }
                    else{
                        System.out.println("\n Você errou :(");
                        break;
                    }
                case 2:
                    if(answ.equals("b")){
                        System.out.println("\n Você acertou!");
                        score++;
                        break;
                    }
                    else{
                        System.out.println("\n Você errou :(");
                        break;
                    }
                case 3:
                    if(answ.equals("c")){
                         System.out.println("\n Você acertou!");
                        score++;
                        break;
                    }
                    else{
                        System.out.println("\n Você errou :(");
                        break;
                    }
                case 4:
                    if(answ.equals("d")){
                        System.out.println("\n Você acertou!");
                        score++;
                        break;
                    }
                    else{
                        System.out.println("\n Você errou :(");
                        break;
                    }
                }
            }

            scanner.close();
            System.out.printf("\n Sua pontuação foi de %d pontos", score);
                
        }

}

