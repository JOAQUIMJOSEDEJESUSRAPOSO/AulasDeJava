public class Main {

    public static void main (String[] args) {

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Joaquim";
        boolean bool = true;

        //Sistema de condicionais
        if (str == "Joaquim") {
            System.out.println("Verdadeiro");
        } else if (str == "Anna") {
            System.out.println("É Anna");
        } else {
            System.out.println("Falso");
        }

        //Vetores
        //primeira forma de iniciar um array
        int[] colecaoDeValores = {1, 2, 3, 4, 5}; //aqui eu inicio passando o tamanho e os valores do meu array

        //se eu tentar aumentar o tamanho dessa array não dar certo, por exemplo: colecaoDeValores[5] = 6

        //segunda forma de iniciar um array
        int[] meusNumeros = new int[5]; //aqui eu inicio passando o tamanho do meu array

        System.out.println(colecaoDeValores.length);
    }
}