package questao3;

public class Consultor {
	public void chamarProximoClienteOficina(Concessionaria concessionaria) {
		Cliente cliente = concessionaria.chamarProximoCliente(TipoDeFila.OFICINA, "Consultor Oficina", 2);
		if (cliente != null) {
			System.out.println("Cliente chamado para a oficina: " + cliente.getNome());
		}
	}

	public void chamarProximoClienteAcessorios(Concessionaria concessionaria) {
		Cliente cliente = concessionaria.chamarProximoCliente(TipoDeFila.ACESSORIOS, "Consultor Acessórios", 3);
		if (cliente != null) {
			System.out.println("Cliente chamado para acessórios: " + cliente.getNome());
		}
	}
}
