package ex44;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
