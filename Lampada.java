public class Lampada {
    protected boolean ligada;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public String getEstado() {
        return ligada ? "Ligada" : "Desligada";
    }
}
