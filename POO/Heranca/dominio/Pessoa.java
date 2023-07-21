package POO.Heranca.dominio;

public class Pessoa extends Object {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco inicialização estatico de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização não estatico de pessoa 2");
    }

    {
        System.out.println("Bloco de inicialização não estatico de pessoa 3");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do contrutor pessoa");
        this.nome = nome;
    }
    public void nextUp(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
