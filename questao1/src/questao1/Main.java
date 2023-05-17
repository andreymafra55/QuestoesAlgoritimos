package questao1;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Enciclopedia enciclopedia = new Enciclopedia();

       
        enciclopedia.adicionarVerbete("JavaScript", "é uma linguagem de programação interpretada de alto nível.");
        enciclopedia.adicionarVerbete("Java", "é uma linguagem de programação e um ambiente computacional criado pela Sun Microsystems na década de 90, sendo posteriormente adquirido pela Oracle.");
        enciclopedia.adicionarVerbete("Php", "é uma linguagem de programação utilizada por programadores e desenvolvedores para construir sites dinâmicos.");

        String definicaoPhp = enciclopedia.buscarDefinicao("Php");
        System.out.println("Definição de Php: " + definicaoPhp);

        String[] verbetesCorrelatos = enciclopedia.buscarCorrelato("linguagem");
        System.out.println("Verbete(s) correlato(s) a 'linguagem': "  + String.join(", ", verbetesCorrelatos));
    }
	}
	
