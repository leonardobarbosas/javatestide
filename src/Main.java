import model.Carro;
import model.CarroEsportivo;

public class Main {
    public static void main(String[] args) {

       // Carro carro = new Carro("Civic", "Honda", 2025);
        // System.out.println(carro.toString());

        CarroEsportivo carro = new CarroEsportivo("Civic", "Honda", 2025, false);
        System.out.println(carro.toString());


    }
}