package poo;

import java.util.Arrays;

public class ContaBancaria {
    int idConta;
    String agencia;
    String numeroConta;
    String tipo;
    double saldo;
    double limiteCredito;

    public void castrarConta(int id, String ag, String nrConta, String tipo, double limite){
        this.idConta = id;
        this.agencia = ag;
        this.numeroConta = nrConta;
        for (String s : Arrays.asList("normal", "especial")) {
            this.tipo= s;
        }
        this.limiteCredito = limite;
    }


    void registrarDeposito(double valor){
         this.saldo += valor;
    }
    boolean registrarSaque(double valor){
        if(this.saldo<valor){
            return false;

        }else{
            this.saldo -= valor;
            return true;
        }
    }

}
