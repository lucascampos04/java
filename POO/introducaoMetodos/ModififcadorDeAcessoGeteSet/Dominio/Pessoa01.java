package POO.introducaoMetodos.ModififcadorDeAcessoGeteSet.Dominio;

public class Pessoa01 {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }


}
