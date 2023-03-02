package poo;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class AppElevador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Elevador elevador = new Elevador(); //instaciar e declara na mesma linha;

        elevador.cadastroElevador(5);
        System.out.printf("Código........%d\n",elevador.codigo);
        System.out.printf("Limite........%d\n",elevador.limitePessoas);
        System.out.printf("Pessoas transportadas....%d\n",elevador.pessoasTransportada);
        System.out.printf("Status.......%s\n",elevador.status);

        System.out.println("1ª operação:");
        elevador.registrarEntrada(6);
        elevador.registrarSaida(1);
        System.out.println("pessoas transportadas: "+ elevador.consultarElevador());
        System.out.printf("Status.......%s\n",elevador.status);

        System.out.println("2ª operação:");
        elevador.registrarEntrada(2);
        elevador.registrarSaida(3);
        System.out.println("pessoas transportadas: "+ elevador.consultarElevador());
        System.out.printf("Status.......%s\n",elevador.status);

        System.out.println("3ª operação:");
        elevador.registrarEntrada(6);
        elevador.registrarSaida(2);
        System.out.println("pessoas transportadas: "+ elevador.consultarElevador());
        System.out.printf("Status.......%s\n",elevador.status);

        System.out.println("4ª operação:");
        elevador.registrarEntrada(3);
        System.out.println("pessoas transportadas: "+ elevador.consultarElevador());
        System.out.printf("Status.......%s\n",elevador.status);

        System.out.println("5ª operação:");
        elevador.registrarEntrada(2);
        System.out.println("pessoas transportadas: "+ elevador.consultarElevador());
        System.out.printf("Status.......%s\n",elevador.status);
    }

}
