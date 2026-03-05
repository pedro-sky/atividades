import java.util.Scanner;


public class exercicio01{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma string: ");
        String palavra = scanner.nextLine();

        System.out.println("digite um numero: ");
        int n = scanner.nextInt();
        String resultado = "";

        for (int i = 0; i < palavra.length(); i++){
            
            char letra = palavra.charAt(i);
            
            if (letra >= 'a' && letra <= 'z'){

                char nova =  (char) ((letra - 'a' + n) % 26 + 'a');
                resultado += nova;
            }

            else if (letra >= 'A' && letra <= 'Z'){

                char nova = (char) ((letra - 'A' + n) % 26 + 'A');
                resultado += nova;

            }

            else{
                
                resultado += letra;
            }

        }

        System.out.println("resultado: " + resultado);
        scanner.close();

    }
}