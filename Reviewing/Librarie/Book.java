package Reviewing.Librarie;

public class Book extends ItemLibrarie implements Emprestavel{
    Book(String titulo){
        super(titulo);
    }
    @Override
    public void emprestar() {
        System.out.println("Livro emprestado: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Livro devolvido: " + titulo);
    }
}
