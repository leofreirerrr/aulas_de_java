public class DoWhile {
    public static void main(String[] args) {
        int n1, n2, min, max;

        System.out.println("Valor inteiro inferior?");
        min = Keyboard.readInt();
        System.out.println("Valor inteiro Superior?");
        max = Keyboard.readInt();

        do{
            System.out.println(min+ "<" + max);
            min++; max--;
        }while(min<max);
        System.out.println(min+" e "+ max+ " Condição final");
    }
}
