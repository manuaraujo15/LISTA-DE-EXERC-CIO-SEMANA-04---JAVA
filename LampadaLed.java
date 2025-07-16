public class LampadaLed extends Lampada {
    public LampadaLed(boolean ligada) {
        super(ligada);
    }

    @Override
    public String getEstado() {
        return "LED - " + super.getEstado();
    }
}
