public class Banco {
    public static void main(String[] args) {
     ContaCorrente c1 = new ContaCorrente("1", 123.45);
     ContaCorrente c2 = new ContaCorrente("2", 23.00);
     ContaCorrente c3 = new ContaCorrente("3", 200.00);

     c1.creditar(100.00);
     System.out.println(c1.getSaldo());

     c2.creditar(20);
     System.out.println(c2.getSaldo());
    }
}