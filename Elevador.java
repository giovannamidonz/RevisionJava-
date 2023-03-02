package poo;

public class Elevador {

    int codigo;
    int limitePessoas ;
    int pessoasTransportada;
    String status;



    void cadastroElevador(int codigo){
        this.codigo = codigo ;
        this.status = "Em operação";
        this.pessoasTransportada= 0;
        this.limitePessoas = 8;
    }

    int consultarElevador(){
        return this.pessoasTransportada;
    }

    void registrarEntrada(int quantPessoas){
        this.pessoasTransportada = this.pessoasTransportada + quantPessoas; //ou this.pessoasTrasportadas += quantPessoas;
        if (pessoasTransportada > this.limitePessoas){
            status = "bloquado";
        }
    }

    //sitanxe resumida
    //a = a +x;
    //a += x;



    void registrarSaida(int quantPessoas){
        pessoasTransportada = pessoasTransportada - quantPessoas;
        if(pessoasTransportada < this.limitePessoas){
            status = "em operação";
        }
    }

}
