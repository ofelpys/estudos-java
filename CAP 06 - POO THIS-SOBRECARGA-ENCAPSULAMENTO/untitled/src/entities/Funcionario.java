package entities;

public class Funcionario {
    public String a;
    public double sal_bruto ;
    public double taxa;

    public double sal_total(double sal_bruto){
        return sal_bruto - taxa;
    }

    public void sal_atual(double porcentagem) {
        sal_bruto += sal_bruto * porcentagem/100;
    }

    public String toString(){
        return a + " ,$ "+ String.format("%.2f", sal_bruto);
    }

}
