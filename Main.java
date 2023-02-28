import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = input.nextInt();
        
        if(numero < 0 ){
            System.out.println("Negativo");
        }else{
            System.out.println("Não Negativo");
        }
    }
}