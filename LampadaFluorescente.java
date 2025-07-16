public class LampadaFluorescente extends Lampada {
    private int comprimento; // em centímetros

    public LampadaFluorescente(boolean ligada, int comprimento) {
        super(ligada);
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    @Override
    public String getEstado() {
        return "Fluorescente (" + comprimento + "cm) - " + super.getEstado();
    }
}
