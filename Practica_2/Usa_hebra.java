public class Usa_hebra {
    public static void main(String[] args) throws InterruptedException {
        hebra h1 = new hebra(1);
        hebra h2 = new hebra(2);
        h1.start();
        h2.start();
        h1.join();
        h2.join();
        System.out.println("Valor de n: " + hebra.n);
    }
}