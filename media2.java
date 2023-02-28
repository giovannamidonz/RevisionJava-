import java.util.Scanner;
public class media2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua primeira nota");
        double primeiraNota = input.nextDouble();
        System.out.println("Digite a sua segunda nota");
        double segundaNota = input.nextDouble();

        double media = (primeiraNota + segundaNota)/2;

        if(media >= 7){
            System.out.println("Aluno(a) "+ nome + " Aprovado(a)");
        }else{
            System.out.println("Aluno(a) "+nome + " Reprovado(a)");
        }
    }
}
