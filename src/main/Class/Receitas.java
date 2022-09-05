public class Receitas extends Conta {

    private double novaReceita;
    private double receitaMensal;
    private double receitaAnual;

   public Receitas (){

   }

    public Receitas(double novaReceita, double receitaMensal, double receitaAnual) {
        this.novaReceita = novaReceita;
        this.receitaMensal = receitaMensal;
        this.receitaAnual = receitaAnual;
    }

    public Receitas(double saldo, double receitas, double despesas, double novaReceita, double receitaMensal, double receitaAnual) {
        super(saldo, receitas, despesas);
        this.novaReceita = novaReceita;
        this.receitaMensal = receitaMensal;
        this.receitaAnual = receitaAnual;
    }

    public double getNovaReceita() {
        return novaReceita;
    }

    public void setNovaReceita(double novaReceita) {
        this.novaReceita = novaReceita;
    }

    public double getReceitaMensal() {
        return receitaMensal;
    }

    public void setReceitaMensal(double receitaMensal) {
        this.receitaMensal = receitaMensal;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    public void setReceitaAnual(double receitaAnual) {
        this.receitaAnual = receitaAnual;
    }
}
