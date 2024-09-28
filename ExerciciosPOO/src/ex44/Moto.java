package ex44;

public class Moto extends Veiculo{
    private boolean temSidecar;

    public Moto(String marca, String modelo, int ano, boolean temSidecar) {
        super(marca, modelo, ano);
        this.temSidecar = temSidecar;
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
