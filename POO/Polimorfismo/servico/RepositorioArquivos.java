package POO.Polimorfismo.servico;

import POO.Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo.");
    }
}
