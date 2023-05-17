package questao3;

public class Main {
	public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Recepcionista recepcionista = new Recepcionista();
        Vendedor vendedor = new Vendedor();
        Consultor consultor = new Consultor();

        recepcionista.cadastrarCliente(concessionaria, "Andrey", "123456789", "Rua 1", "111111111", TipoDeFila.VENDAS);
        recepcionista.cadastrarCliente(concessionaria, "Nubia", "987654321", "Rua 2", "222222222", TipoDeFila.OFICINA);
        recepcionista.cadastrarCliente(concessionaria, "Heitor", "456789123", "Rua 3", "333333333", TipoDeFila.ACESSORIOS);

        vendedor.chamarProximoCliente(concessionaria);
        consultor.chamarProximoClienteOficina(concessionaria);
        consultor.chamarProximoClienteAcessorios(concessionaria);
    }
}
