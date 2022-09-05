import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private String nome;
    private String email;
    private String telefone;
    private int cpf;
    private int rg;
    private int senha;
    private int conta;

    //Relacionamentos
    private List<Conta> count = new ArrayList<>();

    //construtores
    public Cadastro(){
    }
    public Cadastro(String nome, String email, String telefone, int cpf, int rg, int senha, int conta) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.senha = senha;
        this.conta = conta;
    }

    //Métodos
    public void criar(Conta counts){
        count.add(counts);
            }
    public void excluir(Conta counts){
        count.remove(counts);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
}
