public class Main {
    public static void main(String[] args) {
        int numeros[] = {1,2,4,5,6,7,8,9,10,11,12};

        int inicio = 0;
        int meio = 0;
        int fim = numeros.length -1; // posição final do vetor
        int chave = 2;

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

//        //exemplo de uma pesquisa sequencial
//        for(int i = 0; i<numeros.length; i++){
//            if(numeros[i] == 6){
//                System.out.println(numeros[i]);
//            }
//        }


    }
}