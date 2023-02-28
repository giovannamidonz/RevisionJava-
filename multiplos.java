import java.util.Scanner;
public class multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro");
        int numeroA = input.nextInt();
        System.out.println("Digite o segunto valor inteiro");
        int numeroB = input.nextInt();

        if((numeroA % numeroB)==0 || (numeroB % numeroA)==0){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não são Multiplos");
        }
    }
}
