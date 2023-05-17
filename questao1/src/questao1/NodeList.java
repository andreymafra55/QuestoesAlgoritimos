package questao1;

public class NodeList {
	 public String verbete;
	    public String definicao;
	    public NodeList proximo;

	    public NodeList(String verbete, String definicao) {
	        this.verbete = verbete;
	        this.definicao = definicao;
	        this.proximo = null;
	    }
}
