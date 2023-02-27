package br.com.unit.aula01;

public class AppCalculadora {

	public static void main(String[] args) {
		
		//declarando um objeto
		Calculadora calculadora = new Calculadora();
		//amarzenou em dados o objeto 

		calculadora.operando1=10;
		calculadora.operando2=5;
	
		System.out.printf("ADIÇÃO....: %d\n" ,calculadora.adicao());
		System.out.printf("SUBTRAÇÃO....: %d\n",calculadora.subtracao());
		System.out.printf("MULTIPLICAÇÃO....: %d\n",calculadora.multiplicacao());
		System.out.printf("DIVISÃO....: %d\n",calculadora.divisao());
		
	}

}
