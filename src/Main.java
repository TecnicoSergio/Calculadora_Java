import Calc.Calculadora_SR;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora_SR calculadoraSr = new Calculadora_SR
                (12, 12,45, 12, 23, 25);

        System.out.println(calculadoraSr.getN1());
        System.out.println(calculadoraSr.getN2());
        System.out.println(calculadoraSr.getSoma());
        System.out.println(calculadoraSr.getSubtrair());
        System.out.println(calculadoraSr.getDiv());
        System.out.println(calculadoraSr.getMultiplica());

        System.out.println("================================");

        System.out.println(calculadoraSr.n1 + calculadoraSr.n2);
        System.out.println(calculadoraSr.n1 - calculadoraSr.n2);
        System.out.println(calculadoraSr.n1 / calculadoraSr.n2);
        System.out.println(calculadoraSr.n1 * calculadoraSr.n2);
        System.out.println(calculadoraSr.soma + calculadoraSr.subtrair);
        System.out.println(calculadoraSr.div / calculadoraSr.multiplica);
        System.out.println(calculadoraSr.multiplica * calculadoraSr.soma);
        System.out.println(calculadoraSr.subtrair - calculadoraSr.soma);








    }
}