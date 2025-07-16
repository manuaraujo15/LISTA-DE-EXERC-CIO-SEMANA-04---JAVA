public class IngressoVip extends Ingresso {
    protected double adicionalVip;

    public IngressoVip(double valor, double adicionalVip) {
        super(valor);
        this.adicionalVip = adicionalVip;
    }

    public double getValorVip() {
        return valor + adicionalVip;
    }

    public void imprimirValor() {
        System.out.printf("Ingresso VIP: R$ %.2f%n", getValorVip());
    }
}
