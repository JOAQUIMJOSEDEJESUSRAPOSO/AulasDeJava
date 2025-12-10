package ProjetosPOO;

public class ProgramaCarros {
    public static void main(String[] args) {
        Carro carroSimples = new Carro("Sandero", "Verde", "425687", 2014);
        Carro carroMediano = new Carro("Corola", "Preto", "073653", 2017);
        Carro carroLuxo = new Carro("Golf GTI", "Branco", "040897", 2022);

        carroMediano.criarCarro();
        carroSimples.criarCarro();
        carroLuxo.criarCarro();
    }
}