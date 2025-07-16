public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.printf("Valor do ingresso: R$ %.2f%n", valor);
    }
}
