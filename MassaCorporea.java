package br.com.unit.aula01;

public class MassaCorporea {
		
	double peso;
	double altura;
	double imc;
	String situacao;
	

	public MassaCorporea(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.situacao = situacao;
	}
	
	
	void calcularImc() {
		imc = peso / (altura * altura);
	}
	
	void definirSituacao() {
		if (imc < 17) {
			situacao ="muito abaixo do peso";
		}else if(imc < 18.5) {
			situacao ="abaixo do peso";
		}else if(imc <25) {
			situacao="peso normal";
		}else if(imc <30) {
			situacao="Acima do peso";
		}else if(imc <35 ) {
			situacao="Obesidade";
		}else if(imc <= 40) {
			situacao="Obesidade grau 2";
		}else {
			situacao="Obesidade grau 3";
		}
	}
}
