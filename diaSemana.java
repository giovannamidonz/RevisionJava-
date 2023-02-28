import java.util.Scanner;
public class diaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero da semana");
        int x = input.nextInt();

        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
    }
}
