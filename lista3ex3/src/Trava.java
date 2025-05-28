public class Trava {
    String quem;
    boolean travado;

    void trave(String receba){
        quem = receba;
        travado = true;
    }
    void destrave(String altera){
        quem = altera;
        travado = false;
    }

    boolean isTravado(){
        return travado;
    }
}
