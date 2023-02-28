import java.util.Scanner;
public class votacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o ano de nascimento");
        int anoNascimento = input.nextInt();
        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;
        if(idade >= 16){
            System.out.println("Pode Votar");
        }else{
            System.out.println("Não Pode Votar");
        }
    }
}
