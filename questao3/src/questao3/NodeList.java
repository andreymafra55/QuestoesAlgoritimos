package questao3;

public class NodeList {
	private Cliente cliente;
	private NodeList proximo;

	public NodeList(Cliente cliente) {
		this.cliente = cliente;
		this.proximo = null;
	}
	
	 public Cliente getCliente() {
	        return cliente;
	    }

	    public NodeList getProximo() {
	        return proximo;
	    }

	    public void setProximo(NodeList proximo) {
	        this.proximo = proximo;
	    }
}
