package model;

public class CarroEsportivo extends Carro{

    private boolean turbo;

    public CarroEsportivo(String modelo, String marca, int ano, boolean turbo) {
        super(modelo, marca, ano);
        this.turbo = turbo;
    }

    public CarroEsportivo() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "CarroEsportivo{" +
                "turbo=" + turbo +
                '}';
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }


}
