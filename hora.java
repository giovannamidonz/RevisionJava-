import java.util.Scanner;
public class hora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Informe o horário");
        int hora = input.nextInt();

        if(hora <= 12){
            System.out.println("Bom dia, " + nome);
        }else if(hora <= 17){
            System.out.println("Boa tarde, " + nome);
        }else{
            System.out.println("Boa Noite, " + nome);
        }
    }

}
