package POO.Associacao.dominio;

import POO.AssociacaoUnidirecional.dominio.Time;

public class Jogador {
    private String nome;

    public void nextUp(){
        System.out.println(this.nome);
    }
    public Jogador(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
    }
}
