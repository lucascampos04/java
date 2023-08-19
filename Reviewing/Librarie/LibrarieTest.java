package Reviewing.Librarie;

public class LibrarieTest {
    public static void main(String[] args) {
        Book book = new Book("Codigo Limpo");
        Revista revista = new Revista("Veja");

        book.emprestar();
        book.devolver();
        System.out.println("-------------------------");
        revista.emprestar();
        revista.devolver();
    }
}
