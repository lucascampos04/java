package POO.Polimorfismo.test;

import POO.Polimorfismo.Repositorio.Repositorio;
import POO.Polimorfismo.servico.RepositorioArquivos;
import POO.Polimorfismo.servico.RepositorioBancoDeDados;
import POO.Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        System.out.println("-------------------------------");
        Repositorio repositorio1 = new RepositorioArquivos();
        repositorio1.salvar();
        System.out.println("-------------------------------");
        Repositorio repositorio2 = new RepositorioBancoDeDados();
        repositorio2.salvar();


    }
}
