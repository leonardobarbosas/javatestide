package model;

public class Carro implements Veiculo {

    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro() {
    }

    //Método levando a classe para string
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligou!");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerou!");
    }

    @Override
    public void frear() {
        System.out.println("Carro freou!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Carro virou para " + direcao + "!");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligou!");
    }
}
