public class ContaCorrente {
    private String numero;
    private double saldo;

    ContaCorrente(String numConta, double saldoConta){
        numero = numConta;
        saldo = saldoConta;
    }

    String getNumero(){
        return numero;
    }

    void setNumero(String numero){ // serve para modificar o valor da variavel
        this.numero = numero;
    }

    double getSaldo(){
        return saldo;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    void creditar(double valor){
        saldo+=valor;
    }

    void debitar(double valor){
        if(valor<= saldo){
            saldo-=valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
}
