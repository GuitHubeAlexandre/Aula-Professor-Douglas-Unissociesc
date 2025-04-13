import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
    public static void main (String[] args){
        
        Random random = new Random();
        int NumeroAleatorio = random.nextInt (100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        
        while (palpite != NumeroAleatorio){
            System.out.println("Adivinhe o Numero de 1 a 100");
            palpite = scanner.nextInt();
            
            if (palpite < NumeroAleatorio){
                System.out.println("O numero e mairo.Tente novamente.");
            } else if (palpite > NumeroAleatorio){
                System.out.println("O numero e menor.Tente novamente.");
            } else {
                System.out.println("Prabens voce acertou o numero!");
            }
            }
              scanner.close();
    }
}
