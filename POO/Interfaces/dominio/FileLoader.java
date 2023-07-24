package POO.Interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{ ;

    @Override
    public void load() {
        System.out.println("Recebendo dados do banco");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando os arquivos");
    }
}
