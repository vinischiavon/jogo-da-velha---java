package com.uninter;

public abstract class Jogador {
	
	/* Foi criado dois tipos de jogadores, o humano e o computador.
	 * Portanto, seus m�todos de jogar s�o diferentes. Por isso essa classe ser� abstrata, j� que 
	 * ter� os m�todos abstratos 'jogar()' e 'Tentativa()', a estrat�gia � diferente 
	 * para cada tipo de jogador, e o computador n�o far� tentativas que n�o possa. 
	 */
	
	protected int[] tentativa = new int[2];
	
	protected int jogador;
    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    /* Definido o vetor de inteiros 'tentativa[2]', onde tentativa[0] armazenar� a linha e
	 * tentativa[1] a posi��o da coluna de onde o jogador tentar� marcar seu X ou O.
	 */
    
    public abstract void jogar(Tabuleiro tabuleiro);
    
    public abstract void Tentativa(Tabuleiro tabuleiro);
    
    /* O m�todo 'jogar()' recebe o atual tabuleiro, assim como o m�todo 'Tentativa()' 
     * que tamb�m recebe as posi��es (linha, coluna) que o jogador vai tentar marcar com X ou O.
     */

    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
        if(tabuleiro.getPosicao(tentativa) == 0)
            return true;
        else
            return false;
   
    /* O m�todo 'checaTentativa()' vai certificar se na posi��o que o jogador, humano ou computador,
     * ir� marcar no tabuleiro est� realmente vazia, ou seja, se aquela posi��o tem realmente o n�mero 0.
     */
           
    }
    
}


