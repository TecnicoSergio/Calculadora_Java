package Calc;

public class Calculadora_SR {
    public double n1;
    public double n2;

    public double soma;
    public double subtrair;
    public double div;
    public double multiplica;

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }


    public double getSubtrair() {
        return subtrair;
    }

    public void setSubtrair(double subtrair) {
        this.subtrair = subtrair;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }

    public double getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(double multiplica) {
        this.multiplica = multiplica;
    }


//=================================================
    @Override
    public String toString() {
        return "Calculadora_SR{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", soma=" + soma +
                ", subtrair=" + subtrair +
                ", div=" + div +
                ", multiplica=" + multiplica +
                '}';
    }
    //============================]]

    public Calculadora_SR(double n1, double n2, double soma, double subtrair, double div, double multiplica) {
        this.n1 = n1;
        this.n2 = n2;
        this.soma = soma;
        this.subtrair = subtrair;
        this.div = div;
        this.multiplica = multiplica;
    }
    //======================================

    public double soma(){
        double soma = this.n1 + this.n2;

        return (soma);
    }

    public double subtrair(){
        double subtrair = this.n1 - this.n2;
        return (subtrair);
    }
    public double div(){
        double div = this.n1 / this.n2;
        return (div);
    }
    public double multiplicar(){
        double multiplicar = this.n1 * this.n2;
        return (multiplicar);
    }

    //=============================================


    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}
