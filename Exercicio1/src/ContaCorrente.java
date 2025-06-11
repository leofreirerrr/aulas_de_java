public class ContaCorrente {
    private String numero;
    private double saldo;

    ContaCorrente(String numConta, double saldoConta){
        numero = numConta;
        saldo = saldoConta;
    }

    void setNumero(String numero){ // serve para atribuir o valor da variavel
        this.numero = numero;
    }

    String getNumero(){
        return numero;
    }

    void setSaldo(double saldo){
        this.saldo = saldo;
    }

    double getSaldo(){
        return saldo;
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
