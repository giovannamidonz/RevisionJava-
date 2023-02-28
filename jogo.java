import java.util.Scanner;
public class jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a hora inicial do Jogo");
        int horaInicial = input.nextInt();
        System.out.println("Informe a hora final do Jogo");
        int horaFinal = input.nextInt();

        if( horaInicial < horaFinal){

            int duracao = horaFinal - horaInicial;
        }else{
            int duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou = " + duracao + "Hora(s)" );
        }

    }
}
