import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class exercicio03 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma frase\n");
        String frase = scanner.nextLine();

        String[] palavras = frase.toLowerCase().split("\\s+");

        Map<String, Integer> count = new HashMap<>();
        for (String p :  palavras){
            count.put(p, count.getOrDefault(p,0) + 1);
        }

        String palavraRepetida = "";
        int repetições = 0;

        for (Map.Entry<String, Integer> entry : count.entrySet()){
            if (entry.getValue() > repetições){
                repetições = entry.getValue();
                palavraRepetida = entry.getKey();
            }

        }

        System.out.println("\nA palavra mais repetida é " + palavraRepetida + " com " + repetições + " vezes");
    }

}
