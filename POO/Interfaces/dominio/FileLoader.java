package POO.Interfaces.dominio;

public class FileLoader implements DataLoader{ ;

    @Override
    public void load() {
        System.out.println("Recebendo dados do banco");
    }
}
