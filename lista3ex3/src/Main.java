public class Main {
    public static void main(String[] args) {
        Trava teste = new Trava();

        teste.trave("leo");
        System.out.println(teste.quem+" "+ teste.isTravado());

        teste.destrave(("grêmio"));
        System.out.println(teste.quem+" "+ teste.isTravado());
    }
}