package questao3;

public class Vendedor {
	 public void chamarProximoCliente(Concessionaria concessionaria) {
	        Cliente cliente = concessionaria.chamarProximoCliente(TipoDeFila.VENDAS, "Vendedor", 1);
	        if (cliente != null) {
	            System.out.println("Cliente chamado: " + cliente.getNome());
	        }
	    }
}
