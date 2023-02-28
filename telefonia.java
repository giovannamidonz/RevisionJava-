import java.util.Scanner;
public class telefonia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe o valor de minutos gastos: ");
        int minutos = input.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta += ( minutos - 100) * 2.0;

        }
        System.out.println("Valor da conta = R$" + conta);

        input.close();
    }
}

