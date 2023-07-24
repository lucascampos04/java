package POO.Interfaces.dominio;

public interface DataLoader {
    // Nas interfaces tudo é public e abstrato
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checagem sendo feita...");
    }
}
