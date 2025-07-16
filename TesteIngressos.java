public class TesteIngressos {
    public static void main(String[] args) {
        System.out.println("--- Parte (e): Instância única ---");
        IngressoVip vip = new IngressoVip(100.0, 50.0);
        IngressoNormal normal = new IngressoNormal(100.0);
        IngressoCamarote camarote = new IngressoCamarote(100.0, 50.0, 30.0);

        vip.imprimirValor();
        normal.imprimirTipo();
        normal.imprimirValor();
        camarote.imprimirValor();

        System.out.println("\n--- Parte (f): Vetores de objetos ---");

        // Parte (f): vetores de 25 elementos
        IngressoVip[] vips = new IngressoVip[25];
        IngressoNormal[] normals = new IngressoNormal[25];
        IngressoCamarote[] camarotes = new IngressoCamarote[25];

        for (int i = 0; i < 25; i++) {
            vips[i] = new IngressoVip(100.0, 50.0);
            normals[i] = new IngressoNormal(100.0);
            camarotes[i] = new IngressoCamarote(100.0, 50.0, 30.0);
        }

        System.out.println("\n--- Valores dos 25 ingressos VIP ---");
        for (IngressoVip ingresso : vips) {
            ingresso.imprimirValor();
        }

        System.out.println("\n--- Valores dos 25 ingressos Normais ---");
        for (IngressoNormal ingresso : normals) {
            ingresso.imprimirTipo();
            ingresso.imprimirValor();
        }

        System.out.println("\n--- Valores dos 25 ingressos Camarote ---");
        for (IngressoCamarote ingresso : camarotes) {
            ingresso.imprimirValor();
        }
    }
}
