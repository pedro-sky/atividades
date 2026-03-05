import java.util.Scanner;


public class exercicio02{
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite os numeros separados por espaço: ");

        String linhaNumeros = scanner.nextLine();
        String[] separar = linhaNumeros.trim().split("\\s+");
        int[] n = new int[separar.length];

        for (int i = 0; i < separar.length; i++){
            
            n[i] = Integer.parseInt(separar[i]);

        }

        
        System.out.println("digite o resultado da soma desejado: ");

        int resultado = scanner.nextInt();
        System.out.println("resultado encontrado: ");

        for (int i = 0; i < n.length; i++){

            int n1 = n[i];

            for (int j = 0; j < n.length; j++){

                int n2 = n[j];

                if (n1 + n2 == resultado && i != j){

                    
                    System.out.println(n1 + " , " + n2);

                }

            }
        }

        scanner.close();
    }
}