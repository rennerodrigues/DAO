import java.util.ArrayList;
import java.util.List;

public class Conta extends Cadastro{

    private double saldo;
    private double receitas;
    private double despesas;

    //Relacionamentos
    private List<Receitas> receita = new ArrayList<>();
    private List<Despesas> despesa = new ArrayList<>();

    //construtores
    public Conta(){
    }

    public Conta(double saldo, double receitas, double despesas) {
        this.saldo = saldo;
        this.receitas = receitas;
        this.despesas = despesas;
    }

    public Conta(String nome, String email, String telefone, int cpf, int rg, int senha, int conta, double saldo, double receitas, double despesas) {
        super(nome, email, telefone, cpf, rg, senha, conta);
        this.saldo = saldo;
        this.receitas = receitas;
        this.despesas = despesas;
    }


    //Métodos
    public void adicionar(Receitas receitas){

        receita.add(receitas);
    }

    public void remover(Receitas receitas){
        receita.remove(receitas);
    }
    public void adicionar(Despesas despesas){

        despesa.add(despesas);
    }

    public void remover(Despesas despesas){

        despesa.remove(despesas);
    }
    public void editar(Despesas despesa){
        despesa.edit(despesas);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getReceitas() {
        return receitas;
    }

    public void setReceitas(double receitas) {
        this.receitas = receitas;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
}
