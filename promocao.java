import java.util.Scanner;
public class promocao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = input.next();
        System.out.println("Informe seu sexo");
        String sexo = input.next();
        System.out.println("informe o valor das compras");
        double valorCompras = input.nextDouble();

        double desconto1 = valorCompras *(5/100);
        double desconto2 = valorCompras *(13/100);

        double valorTotal1 = valorCompras - desconto1;
        double valorTotal2 = valorCompras - desconto2;

        if(sexo == "f"){
            System.out.println("O desconto de, "+nome+" é R$ "+valorTotal2);
        }else{
            System.out.println("O desconto de, "+nome+" é R$ "+valorTotal1);
        }
    }

}
