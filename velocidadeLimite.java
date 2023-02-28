import java.util.Scanner;
public class velocidadeLimite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int limite = 80;
        System.out.println("informe a velocidade do carro");
        int km = input.nextInt();
        int calMulta = km - limite;
        int multa = calMulta * 5;

        if(km > limite ){
            System.out.println("sua velocidade ultrapassou o limite");
            System.out.println("valor da multa: " + multa);
        }else{
            System.out.println("siga uma boa viagem");
        }
    }
}
