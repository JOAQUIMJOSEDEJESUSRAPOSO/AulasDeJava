package AulasPOO;

public class Humano extends SerVivo{
    public Humano() {
        super(34);
    }
    @Override
    public void respirar() {
        System.out.println("Respirando...");
    }
    @Override
    public void dormir() {
        super.dormir();
    }
}
