import java.util.Calendar;

public class Despesas extends Conta {

    private double gerais;
    private double cartao;
    private double energia;
    private double agua;
    private Calendar dataDespesa;

    public Despesas (){

    }

    public Despesas(double saldo, double receitas, double despesas, double gerais, double cartao, double energia, double agua, Calendar dataDespesa) {
        super(saldo, receitas, despesas);
        this.gerais = gerais;
        this.cartao = cartao;
        this.energia = energia;
        this.agua = agua;
        this.dataDespesa = dataDespesa;
    }

    public Despesas(String nome, String email, String telefone, int cpf, int rg, int senha, int conta, double saldo, double receitas, double despesas, double gerais, double cartao, double energia, double agua, Calendar dataDespesa) {
        super(nome, email, telefone, cpf, rg, senha, conta, saldo, receitas, despesas);
        this.gerais = gerais;
        this.cartao = cartao;
        this.energia = energia;
        this.agua = agua;
        this.dataDespesa = dataDespesa;
    }

    public double calcularTotal() {
        return novaReceita -= saldo;

    }


    public double calcularTotal(){
        return
    }
}
