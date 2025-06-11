public class Main {
    public static void main(String[] args) {
//        int n;
//        int table [][] = new int[3][3];
//
//        //numero de linhas da matriz
//        int row = table.length;;
//
//        //numero de colunas da matriz
//        row = table[row].length;
//

        //como ler os dados da matriz
        int myArray [][] = {
            {3, 1, 2},
            {9, 7, 8},
            {4, 5, 6}
        };

        int A[][] = {{2,3,5}, {7,8,9}};
        int B[][] = {{7,5,1}, {6,1,3}};
        int C[][] = {{0,0,0}, {0,0,0}};
        for(int i = 0; i< myArray.length; i++){
            for(int j = 0; j<myArray[i].length; j++){
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}