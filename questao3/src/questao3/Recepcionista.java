package questao3;

public class Recepcionista {
	public void cadastrarCliente(Concessionaria concessionaria, String nome, String cpf, String endereco, String telefone, TipoDeFila filaTipo) {
        Cliente cliente = new Cliente(nome, cpf, endereco, telefone);
        concessionaria.adicionarCliente(cliente, filaTipo);
        System.out.println("Cliente cadastrado com sucesso.");
    }
}
