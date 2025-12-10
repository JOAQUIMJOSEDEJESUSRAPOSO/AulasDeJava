package ProjetosPOO;

class Carro {
    String modelo;
    String cor;
    String placa;
    int ano;

    public Carro(String modelo, String cor, String placa, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
    }
    public void criarCarro() {
        System.out.println("ProjetosPOO.Carro Solicitado!");
        System.out.println("Modelo: " + modelo + "\nCor: " + cor + "\nPlaca: " + placa + "\nAno: " + ano);
    }
}