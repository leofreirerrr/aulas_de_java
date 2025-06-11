public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void setIdade(int idade) {
        if(idade>=0){
            this.idade = idade;
        }else{
            System.out.println("Idade Inválida");
        }
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    int getIdade(){
        return idade;
    }


}
