import java.util.Scanner;
public class par_impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = input.nextInt();

        if((numero % 2) == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
