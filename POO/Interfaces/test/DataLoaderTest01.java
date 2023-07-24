package POO.Interfaces.test;

import POO.Interfaces.dominio.DataBaseLoader;
import POO.Interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
    }
}
