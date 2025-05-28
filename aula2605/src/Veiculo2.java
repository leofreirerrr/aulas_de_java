public class Veiculo2 {
    int passageiros;
    int ccombustivel;
    int consumo;

    int autonomia(){
        return (ccombustivel*consumo);

    }
    double necombustivel(int distkm){
        return (double) distkm/consumo;
    }

}
