package questao3;

public class Concessionaria {
	private Fila filaVendas;
	private Fila filaOficina;
	private Fila filaAcessorios;

	public Concessionaria() {
		filaVendas = new Fila();
		filaOficina = new Fila();
		filaAcessorios = new Fila();
	}

	public void adicionarCliente(Cliente cliente, TipoDeFila filaTipo) {
		switch (filaTipo) {
		case VENDAS:
			filaVendas.enfileirar(cliente);
			break;
		case OFICINA:
			filaOficina.enfileirar(cliente);
			break;
		case ACESSORIOS:
			filaAcessorios.enfileirar(cliente);
			break;
		}
	}

	public Cliente chamarProximoCliente(TipoDeFila filaTipo, String nomeAtendente, int numeroMesa) {
		Fila filaAtual = null;
		switch (filaTipo) {
		case VENDAS:
			filaAtual = filaVendas;
			break;
		case OFICINA:
			filaAtual = filaOficina;
			break;
		case ACESSORIOS:
			filaAtual = filaAcessorios;
			break;
		}

		if (filaAtual != null && !filaAtual.estaVazia()) {
			Cliente cliente = filaAtual.desenfileirar();
			System.out.println("Próximo cliente chamado: " + cliente.getNome());
			Atendimento atendimento = new Atendimento(nomeAtendente, numeroMesa);
			System.out.println("Atendimento realizado por: " + atendimento.getNomeAtendente() + " na mesa "
					+ atendimento.getNumeroMesa());
			return cliente;
		} else {
			System.out.println("Não há clientes na fila de " + filaTipo.toString().toLowerCase() + ".");
			return null;
		}
	}

	public int getTamanhoFila(TipoDeFila filaTipo) {
        switch (filaTipo) {
            case VENDAS:
                return filaVendas.tamanho();
            case OFICINA:
                return filaOficina.tamanho();
            case ACESSORIOS:
                return filaAcessorios.tamanho();
            default:
                return 0;
        }
    }
}
