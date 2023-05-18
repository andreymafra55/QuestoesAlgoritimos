package questao2;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe o tamanho da pista: ");
	        int tamanhoPista = scanner.nextInt();
	        
	        int[] pista = gerarPista(tamanhoPista);
	        
	        int energiasCapturadas = 0;
	        int bombasBatidas = 0;
	        int posicaoAtual = 0;
	        
	        while (posicaoAtual < tamanhoPista) {
	            System.out.println("Posição atual: " + posicaoAtual);
	            System.out.println("Escolha uma ação:");
	            System.out.println("1. Avançar");
	            System.out.println("2. Pular");
	            
	            int acao = scanner.nextInt();
	            
	            if (acao == 1) {
	                int tijoloAtual = pista[posicaoAtual];
	                
	                if (tijoloAtual == 1) {
	                    bombasBatidas++;
	                    System.out.println("Você caiu numa bomba!");
	                    break;
	                } else if (tijoloAtual == 2) {
	                    energiasCapturadas++;
	                    System.out.println("Você capturou uma energia!");
	                }
	                
	                posicaoAtual++;
	            } else if (acao == 2) {
	                posicaoAtual++;
	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	        
	        System.out.println("Estatísticas do Jogo:");
	        System.out.println("Tijolos percorridos: " + posicaoAtual);
	        System.out.println("Energias capturadas: " + energiasCapturadas);
	        System.out.println("Bombas batidas: " + bombasBatidas);
	        
	        scanner.close();
	    }
	    
	    private static int[] gerarPista(int tamanho) {
	        int[] pista = new int[tamanho];
	        Random random = new Random();
	        
	        for (int i = 0; i < tamanho; i++) {
	            int tijolo = random.nextInt(10); 
	            
	            if (tijolo == 0) {
	                tijolo = 2; 
	            }
	            
	            pista[i] = tijolo;
	        }
	        
	        return pista;
	    }
}
