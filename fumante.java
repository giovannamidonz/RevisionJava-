import java.util.Scanner;
public class fumante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantindade de cigarros fuma por dia?");
        int cigarroPorDia = input.nextInt();
        System.out.println("Quantos anos já fumou");
        int anosFumando = input.nextInt();

        int vidaEmMinuto = anosFumando * 365 * cigarroPorDia * 10 ;
        int vidaEmDias = vidaEmMinuto / (24 * 60);
        System.out.println("Resto de vida é: " + vidaEmDias);
    }
}
