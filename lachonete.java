import java.util.Scanner;
public class lachonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o código do seu lanche");
        double codigo = input.nextDouble();

        if(codigo == 1 ){
            double pagar = 4.00;
            System.out.println("Total: R$ " + pagar);
        }else if(codigo ==2){
            double pagar = 4.50;
            System.out.println("Total: R$ " + pagar);
        }else if(codigo == 3){
            double pagar = 5.00;
            System.out.println("Total: R$ " + pagar);
        }else if(codigo == 4){
            double pagar = 2;
            System.out.println("Total: R$ " + pagar);
        }else if(codigo == 5){
            double pagar = 1.50;
            System.out.println("Total: R$ " + pagar);
        }else{
            System.out.println("informe novamente");
        }

    }
}
