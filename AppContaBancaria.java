package poo;
import java.util.Scanner;
public class AppContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaBancaria banco = new ContaBancaria();//instanciar e declarar;

        banco.castrarConta(2,"1234","12345678-9","especial",2000);
        System.out.printf("IdConta........%d\n",banco.idConta);
        System.out.printf("AGENCIA........%s\n",banco.agencia);
        System.out.printf("Numero da Conta....%s\n",banco.numeroConta);
        System.out.printf("TIPO da conta.......%s\n",banco.tipo);
        System.out.printf("Limite da conta.......%.2f\n",banco.limiteCredito);

        banco.registrarDeposito(1000);
        System.out.printf("novo deposito.......%.2f\n",banco.saldo);
        banco.registrarDeposito(500);
        System.out.printf("novo deposito.......%.2f\n",banco.saldo);//3.500 limite

        banco.registrarSaque(1000);
        System.out.printf("retirou da conta.......%.2f\n",banco.saldo);
        banco.registrarSaque(2000);
        System.out.printf("retirou da conta.......%.2f\n",banco.saldo);
        banco.registrarSaque(800);
        System.out.printf("retirou da conta.......%.2f\n",banco.saldo);


    }

}
