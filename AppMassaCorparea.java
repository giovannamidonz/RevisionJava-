package br.com.unit.aula01;
import java.util.Scanner;
public class AppMassaCorparea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MassaCorporea mc = new MassaCorporea(70,1.80);
		
			//syso -> print
		mc.calcularImc();
		mc.definirSituacao();
		
		System.out.printf("\nIMC.......: %.1f", mc.imc);
		System.out.printf("\nSITUAÇÃO.......: %s", mc.situacao);
		
		input.close();
	}

}
