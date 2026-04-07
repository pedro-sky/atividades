import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        System.out.println("O numero de palavras na frase é " + palavras.length);


    }
}
