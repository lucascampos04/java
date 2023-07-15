package POO.Associacao.dominio;

<<<<<<< HEAD
import POO.AssociacaoUnidirecional.dominio.Time;

public class Jogador {
    private String nome;
    private Time time;
    public void nextUp(){
        System.out.println(this.nome);
        if (time == null){
            System.out.println(time.getNome());
            return;
        }
        System.out.println(time.getNome());
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

=======
public class Jogador {
    private String nome;

    public void nextUp(){
        System.out.println(this.nome);
    }
>>>>>>> 2ab646b (Associação pt1)
    public Jogador(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
