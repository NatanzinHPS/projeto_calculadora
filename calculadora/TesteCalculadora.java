package calculadora;
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.calc(10, 5, "+");
        calc.calc(10, 5, "-");
        calc.calc(10, 5, "*");
        calc.calc(10, 0, "/");
        calc.calc(10, 5, "/");
        calc.calc(10, 5, "%");

    }
}
