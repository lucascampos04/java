package Reviewing.Librarie;

public class Revista extends ItemLibrarie implements Emprestavel{
    public Revista(String titulo) {
        super(titulo);
    }
    @Override
    public void emprestar() {
        System.out.println("Revista emprestada: " + titulo);
    }
    @Override
    public void devolver() {
        System.out.println("Revista devolvida: " + titulo);
    }
}
