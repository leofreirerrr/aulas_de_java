public class PesquisaBinaria {
    private int numeros[];

    PesquisaBinaria(int numeros []){
        this.numeros[] =
    }


    int inicio = 0;
    int meio = 0;
    int fim = numeros.length -1; // posição final do vetor
    int chave = 2;
    int min = 0;
    int max = 0;

    void pesquisa(){
        while (inicio<=fim){
            meio = (fim+inicio)/2;
            System.out.println(numeros[meio]);
            if(numeros[meio]==chave){
                System.out.println("Encontrou o numero: "+numeros[meio]);
                break;
            } else if (numeros[meio]>chave) {
                fim = meio-1;
            } else if (numeros[meio]<chave) {
                inicio = meio+1;
            }
        }
    }
    void pesquisaMaiorMenor(){
        for (int i = 1; i< numeros.length;i++){
            if(numeros[i]<min) min = numeros[i];
            if(numeros[i]>max) max = numeros[i];
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
