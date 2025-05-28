public class InstanciaVeiculo {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        Veiculo sportcar = new Veiculo();

        sportcar.passageiros = 6;


        minivan.passageiros = 7;
        minivan.combistivel = 50;
        minivan.consumo = 11;

        minivan.autonomia();

    }
}

