package questao3;

public class Fila {
	private NodeList primeiro;
	private NodeList ultimo;

	public Fila() {
		primeiro = null;
		ultimo = null;
	}

	public void enfileirar(Cliente cliente) {
		NodeList novoNodo = new NodeList(cliente);
		if (estaVazia()) {
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			ultimo.setProximo(novoNodo);
			ultimo = novoNodo;
		}
	}

	public Cliente desenfileirar() {
		if (estaVazia()) {
			return null;
		} else {
			NodeList nodoRemovido = primeiro;
			primeiro = primeiro.getProximo();
			if (primeiro == null) {
				ultimo = null;
			}
			return nodoRemovido.getCliente();
		}
	}

	public boolean estaVazia() {
		return primeiro == null;
	}

	public int tamanho() {
		int tamanho = 0;
		NodeList atual = primeiro;
		while (atual != null) {
			tamanho++;
			atual = atual.getProximo();
		}
		return tamanho;
	}
}
