package com.uninter;

public class Tabuleiro {
	//Criação de matriz 3x3 de inteiro, neste caso o tabuleiro do jogo.
	private int[][] tabuleiro= new int[3][3];
    
	//Construtor da classe Tabuleiro.
    public Tabuleiro(){
        zeraTabuleiro();
    }
    
    //Limpar todos os campos do tabuleiro.
    public void zeraTabuleiro(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                tabuleiro[linha][coluna]=0;
    }
    
    public void exibeTabuleiro(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){ //Percorre todos os elementos do tabuleiro
                
                if(tabuleiro[linha][coluna]==-1){//Caso encontre -1, imprime X
                    System.out.print(" X ");
                }
                if(tabuleiro[linha][coluna]==1){//Caso encontre 1, imprime O
                    System.out.print(" O ");
                }
                if(tabuleiro[linha][coluna]==0){//Caso encontre 0, não imprime nada (campo vazio)
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }
   
    //Método que retorna a posição no tabuleiro.
    public int getPosicao(int[] tentativa){
        return tabuleiro[tentativa[0]][tentativa[1]];
    }
   
    //Método que preenche uma jogada no tabuleiro.
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        else
            tabuleiro[tentativa[0]][tentativa[1]] = 1;
        
        exibeTabuleiro();
    }
   
    /*Métodos que fazem a checagem de todas linhas, colunas e diagonais:
     *Se alguma linha, coluna ou diagonal estiver toda ocupada e marcadas com 'X', então a soma dos elementos
     *dessa fila será -3 (-1 + -1 + -1 = -3), e o método retorna -1, mostrando que o jogador 1 venceu.
 	 *Se alguma linha, coluna ou diagonal estiver toda ocupada e marcadas com 'O', então a soma dos elementos 
 	 *dessa fila será 3 (1 + 1 + 1 = 3), e o método retorna 1, sinalizando que o jogador 2 ganhou.
 	 */
   
    public int checaLinhas(){
        for(int linha=0 ; linha<3 ; linha++){

            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
                return -1;
            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checaColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
                return -1;
            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
   
    public int checaDiagonais(){
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
            return -1;
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
            return 1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
            return -1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
            return 1;
        
        return 0;
    }

    /* Método que checa todos os elementos da matriz, caso encontre um número 0, retorna false. 
     * Isso indica que a matriz não está totalmente preenchida.
	 * Caso não encontre um número 0, é porque todos são 1 ou -1. Ou seja,
	 * o tabuleiro está completo, retornamos true, e o jogo deu empatado.
     */
    public boolean tabuleiroCompleto(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if( tabuleiro[linha][coluna]==0 )
                    return false;
        return true;
    }

}




