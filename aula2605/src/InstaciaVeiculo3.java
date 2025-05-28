public class InstaciaVeiculo3 {
    public static void main(String[] args){
        int dist = 1000; double litros;
        Veiculo2 minivan = new Veiculo2();

        minivan.passageiros = 7; minivan.ccombustivel = 50; minivan.consumo = 11;
        Veiculo2 sportscar = new Veiculo2();
        sportscar.passageiros = 6; sportscar.ccombustivel = 70; sportscar.consumo = 10;

        litros = minivan.necombustivel((dist));
        System.out.println("Para percorrer: "+dist+ "km, a minivan necessita: "+ litros+ " de combustível");

        litros = sportscar.necombustivel(dist);
        System.out.println("Para percorrer: "+dist+ "km, sportscar necessita: "+ litros+ " de combustível");
    }
}
