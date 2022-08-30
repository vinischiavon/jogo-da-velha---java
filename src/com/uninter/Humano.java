package com.uninter;

import java.util.Scanner;

public class Humano extends Jogador {

//Classe Humano herdeira da classe abstrata Jogador.
	
public Scanner entrada = new Scanner(System.in);
    
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        System.out.println("Jogador 'Humano' criado!");
        
    /* Cada objeto criado recebe um número, 1 ou 2, que vai caracterizar como jogador 1 ou jogador 2,
     * para os usuários saberem de quem é a vez de jogar.
     */
   
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador); 
        
        /* Quando o jogador humano colocar uma dado correto, marcamos o 'X' ou o 'O' no tabuleiro 
         * através do método 'setPosicao()', do objeto 'tabuleiro' da classe "Tabuleiro".
         */
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
    
    /* Método 'Tentativa()' vai pedir a linha e a coluna, checando se os números são válidos 
     * (1, 2 ou 3) e vai fazer a alteração da matriz que visualizamos para matriz real do jogo.
     * Pois como jogador, vemos as linhas e colunas 1, 2 e 3. Porém, ao criamos a matriz tabuleiro[3][3],
     * trabalhamos com linhas e colunas de números 0, 1 e 2.
     * Assim, se o jogador digitar linha 2 e coluna 3, o programa subtrai uma unidade de cada posição e 
     * envia 'linha 1 e coluna 2' pro Java.
     */
    	
    	do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if(tentativa[0] > 3 || tentativa[0] < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");   
            }
            
            while(tentativa[0] > 3 || tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 || tentativa[1] < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                
            }while(tentativa[1] > 3 || tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while(!checaTentativa(tentativa, tabuleiro) );
        
    	/* Método 'checaTentativa()' criado para saber se na posição desejada já não existe algum X ou 0,
    	 * além de certificar que o usuário humano não vai colocar um número maior que 3 ou 
    	 * menor que 1.
    	 */
    
    }

}


