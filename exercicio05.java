import java.sql.SQLOutput;
import java.util.Scanner;


public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = sc.nextLine();


        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" ");
        }

        System.out.println((fraseInvertida.toString().trim()));

    }
}
