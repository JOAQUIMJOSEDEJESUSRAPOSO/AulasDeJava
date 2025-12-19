package AulasPOO;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();
        meuCarro.acelerar();
        meuCarro2.acelerar();

        SerVivo meuHumano = new Humano();
        meuHumano.dormir();
    }
}
