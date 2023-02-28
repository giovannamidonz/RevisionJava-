import java.util.Scanner;
public class alistamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int anoAtual = 2023;
        final int limite = 18;

        System.out.println("informe o ano de nascimento");
        int anoNascimento = input.nextInt();

        int idade = anoAtual - anoNascimento;
        int calcAlistamento = limite - idade;

        if(idade < limite){
            System.out.println("Falta "+calcAlistamento+" para o alistamento");
        }else if(idade > limite){
            System.out.println("Já se passaram "+ calcAlistamento+" do alistamento");
        }else{
            System.out.println("Está na idade correta");
        }
    }
}
