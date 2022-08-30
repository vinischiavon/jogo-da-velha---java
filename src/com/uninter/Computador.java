package com.uninter;

public class Computador extends Jogador {
	
	/* Criação da classe Computador, também herdeira da classe abstrata Jogador.
	 * Essa classe foi criada baseada na classe Humano, utilizando os mesmos métodos, porém no método
	 * Tentativa() foi utilizado a função Math.random, na qual faz com que o computador execute de 
	 * forma aleatória a sua jogada, preenchendo um campo do tabuleiro.
	 */
	
	public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
    	Tentativa(tabuleiro); tabuleiro.setPosicao(tentativa, jogador);

    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
    	
    	do{ 
    		do{ 
    			tentativa[0] = (int)(1+Math.random()*3); 
    			
    			if( tentativa[0] > 3 || tentativa[0] < 1) 
    				System.out.print(""); 
    			}
    	
    	while( tentativa[0] > 3 || tentativa[0] < 1);
    	
    	do{ 
    		tentativa[1] = (int)(1+Math.random()*3); 
    		
    		if(tentativa[1] > 3 || tentativa[1] < 1) 
    			System.out.print(""); 
    	
    	}while(tentativa[1] > 3 || tentativa[1] < 1);
    	
    	tentativa[0]--; 
    	tentativa[1]--;
    	
    		if(!checaTentativa(tentativa, tabuleiro)) 
    		System.out.print(""); 
    		}
    	
    	while(!checaTentativa(tentativa, tabuleiro)); 
    }

}



