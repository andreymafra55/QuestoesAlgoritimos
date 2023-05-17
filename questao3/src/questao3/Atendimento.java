package questao3;

public class Atendimento {
	private String nomeAtendente;
    private int numeroMesa;

    public Atendimento(String nomeAtendente, int numeroMesa) {
        this.nomeAtendente = nomeAtendente;
        this.numeroMesa = numeroMesa;
    }

    public String getNomeAtendente() {
        return nomeAtendente;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }
}
