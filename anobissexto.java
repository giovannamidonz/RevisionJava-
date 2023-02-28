import java.util.Scanner;
public class anobissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o ano");
        int ano = input.nextInt();

        if((ano % 4)==0){
            System.out.println("O ano é Bissexto");
        }else{
            System.out.println("O ano não é Bissexto");
        }
    }
}
