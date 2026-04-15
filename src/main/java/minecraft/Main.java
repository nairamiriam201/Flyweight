package minecraft;

public class Main {

    public static void main(String[] args) {

        TipoBloco pedra1 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        TipoBloco pedra2 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        TipoBloco pedra3 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        pedra1.exibir(10, 64, 20);
        pedra2.exibir(11, 64, 20);
        pedra3.exibir(12, 64, 20);

        TipoBloco grama1 = BlocoFactory.getBloco("Grama", "grama.png", true);
        TipoBloco grama2 = BlocoFactory.getBloco("Grama", "grama.png", true);
        grama1.exibir(15, 64, 22);
        grama2.exibir(16, 64, 22);


        TipoBloco madeira = BlocoFactory.getBloco("Madeira", "madeira.png", true);
        madeira.exibir(30, 65, 10);

        System.out.println();
        System.out.println("pedra1 e pedra2 sao o mesmo objeto? " + (pedra1 == pedra2));
    }
}