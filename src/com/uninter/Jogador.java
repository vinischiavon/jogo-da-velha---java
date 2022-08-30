package com.uninter;

public abstract class Jogador {
	
	/* Foi criado dois tipos de jogadores, o humano e o computador.
	 * Portanto, seus métodos de jogar são diferentes. Por isso essa classe será abstrata, já que 
	 * terá os métodos abstratos 'jogar()' e 'Tentativa()', a estratégia é diferente 
	 * para cada tipo de jogador, e o computador não fará tentativas que não possa. 
	 */
	
	protected int[] tentativa = new int[2];
	
	protected int jogador;
    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    /* Definido o vetor de inteiros 'tentativa[2]', onde tentativa[0] armazenará a linha e
	 * tentativa[1] a posição da coluna de onde o jogador tentará marcar seu X ou O.
	 */
    
    public abstract void jogar(Tabuleiro tabuleiro);
    
    public abstract void Tentativa(Tabuleiro tabuleiro);
    
    /* O método 'jogar()' recebe o atual tabuleiro, assim como o método 'Tentativa()' 
     * que também recebe as posições (linha, coluna) que o jogador vai tentar marcar com X ou O.
     */

    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
        if(tabuleiro.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
   
    /* O método 'checaTentativa()' vai certificar se na posição que o jogador, humano ou computador,
     * irá marcar no tabuleiro está realmente vazia, ou seja, se aquela posição tem realmente o número 0.
     */
           
    }
    
}


