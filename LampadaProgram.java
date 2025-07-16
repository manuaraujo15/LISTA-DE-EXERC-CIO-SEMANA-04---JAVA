public class LampadaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LampadaFluorescente fluorescente = new LampadaFluorescente(false, 120);
        LampadaLed led = new LampadaLed(true);

        System.out.println("Escolha a lâmpada:");
        System.out.println("1 - Fluorescente");
        System.out.println("2 - LED");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Lampada lampadaEscolhida;

        if (opcao == 1) {
            lampadaEscolhida = fluorescente;
        } else if (opcao == 2) {
            lampadaEscolhida = led;
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        System.out.println("Estado atual: " + lampadaEscolhida.getEstado());

        if (lampadaEscolhida.ligada) {
            System.out.println("Desligando a lâmpada...");
            lampadaEscolhida.desligar();
        } else {
            System.out.println("Ligando a lâmpada...");
            lampadaEscolhida.ligar();
        }

        System.out.println("Novo estado: " + lampadaEscolhida.getEstado());

        scanner.close();
    }
}
