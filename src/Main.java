public class Main {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora(6,2);
       calculadora.sumar(2);
        System.out.println(calculadora);
        System.out.println("La resta es: "+calculadora.resta());
    }
}