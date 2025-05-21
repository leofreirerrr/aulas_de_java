public class InstanciaVeiculo {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();

        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = carro1;

        minivan.passageiros = 7;
        minivan.combistivel = 50;
        minivan.consumo = 11;

        carro1.combistivel = 50;

        int autonomia = minivan.combistivel* minivan.consumo;

        System.out.println("Combistivel do carro 1: "+ carro1.combistivel);
        System.out.println(("COmbustícel do carro 2: "+ carro2.combistivel));
    }
}

