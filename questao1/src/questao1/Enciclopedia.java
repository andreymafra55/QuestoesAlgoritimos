package questao1;

import java.util.*;

public class Enciclopedia {
    private NodeList inicio;
    private int tamanho;
    
    public Enciclopedia() {
    	inicio = null;
    	tamanho = 0;
    }
    
    public void adicionarVerbete(String verbete, String definicao) {
        NodeList novoNode = new NodeList(verbete.toLowerCase(), definicao);

        if (inicio == null || verbete.compareTo(inicio.verbete) < 0) {
            novoNode.proximo = inicio;
            inicio = novoNode;
        } else {
            NodeList atual = inicio;
            NodeList anterior = null;

            while (atual != null && verbete.compareTo(atual.verbete) > 0) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = novoNode;
            novoNode.proximo = atual;
        }

        tamanho++;
    }

    public void removerVerbete(String verbete) {
        if (inicio != null) {
            if (verbete.equalsIgnoreCase(inicio.verbete)) {
            	inicio = inicio.proximo;
                tamanho--;
            } else {
                NodeList atual = inicio;
                NodeList anterior = null;

                while (atual != null && !verbete.equalsIgnoreCase(atual.verbete)) {
                    anterior = atual;
                    atual = atual.proximo;
                }

                if (atual != null) {
                    anterior.proximo = atual.proximo;
                    tamanho--;
                }
            }
        }
    }

    public void alterarDefinicao(String verbete, String novaDefinicao) {
        NodeList atual = inicio;

        while (atual != null && !verbete.equalsIgnoreCase(atual.verbete)) {
            atual = atual.proximo;
        }

        if (atual != null) {
            atual.definicao = novaDefinicao;
        }
    }

    public String buscarDefinicao(String verbete) {
        NodeList atual = inicio;

        while (atual != null && !verbete.equalsIgnoreCase(atual.verbete)) {
            atual = atual.proximo;
        }

        if (atual != null) {
            return atual.definicao;
        }

        return null;
    }

    public String[] buscarCorrelato(String palavra) {
        List<String> verbetesCorrelatos = new ArrayList<>();

        NodeList atual = inicio;

        while (atual != null) {
            if (atual.definicao.contains(palavra.toLowerCase())) {
                verbetesCorrelatos.add(atual.verbete);
            }
            atual = atual.proximo;
        }

        return verbetesCorrelatos.toArray(new String[0]);
    }

    public int getTamanho() {
        return tamanho;
    }
}
