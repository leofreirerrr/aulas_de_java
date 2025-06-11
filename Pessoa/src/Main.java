public class Main {
    public static void main(String[] args) {
        int novaIdade;
        Pessoa pessoa1 = new Pessoa("Leonardo", 20);
        Pessoa pessoa2 = new Pessoa("Júlio",21);

        System.out.println("Nome da pessoa1: "+pessoa1.getNome()+" Idade da pessoa1: "+pessoa1.getIdade());
        System.out.println("Nome da pessoa2: "+pessoa2.getNome()+" Idade da pessoa2: "+pessoa2.getIdade());

        System.out.println("mude a idade da pessoa2: ");
        novaIdade = Keyboard.readInt();
        pessoa2.setIdade(novaIdade);

        System.out.println(pessoa2.getIdade());

    }
}