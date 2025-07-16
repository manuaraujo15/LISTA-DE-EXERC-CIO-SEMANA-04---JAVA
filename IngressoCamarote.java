public class IngressoCamarote extends IngressoVip {
    private double adicionalCamarote;

    public IngressoCamarote(double valor, double adicionalVip, double adicionalCamarote) {
        super(valor, adicionalVip);
        this.adicionalCamarote = adicionalCamarote;
    }

    public double getValorCamarote() {
        return valor + adicionalVip + adicionalCamarote;
    }

    @Override
    public void imprimirValor() {
        System.out.printf("Ingresso Camarote: R$ %.2f%n", getValorCamarote());
    }
}
