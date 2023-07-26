package POO.Polimorfismo.servico;

import POO.Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria.");
    }
}
