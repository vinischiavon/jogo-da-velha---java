package com.uninter;
import java.util.Scanner;

	public class Jogo {
		    private Tabuleiro tabuleiro;//Cria através de variáveis um tabuleiro
		    private int rodada=1, vez=1; //Controla o número da rodada e de quem é a vez de jogar
		    private Jogador jogador1;
		    private Jogador jogador2;
		    public Scanner entrada = new Scanner(System.in); //Receber dados do jogador Humano

		    //Construtor Jogo inicia tabuleiro
		    public Jogo(){
		        tabuleiro = new Tabuleiro();
		        iniciaJogadores();
		        
		        while(Jogar()); // Comando que dá start ao jogo!
		    }
		    
		    public void iniciaJogadores(){
		        System.out.println("Quem vai ser o Jogador 1 -> X?");
		        if(escolherJogador() == 1)
		            this.jogador1 = new Humano(1);
		        else
		            this.jogador1 = new Computador(1);
		        
		        System.out.println("----------------------");
		        System.out.println("Quem vai ser o Jogador 2 -> O?");
		        
		        if(escolherJogador() == 1)
		            this.jogador2 = new Humano(2);
		        else
		            this.jogador2 = new Computador(2);
		        
		    }
		    
		    public int escolherJogador(){
		        int opcao = 0;
		        
		        do{
		            System.out.println("1. Humano");
		            System.out.println("2. Computador");
		            System.out.println("Opção: ");
		            opcao = entrada.nextInt();
		            
		            if(opcao != 1 && opcao != 2)
		                System.out.println("Opção inválida! Tente novamente");
		        }while(opcao != 1 && opcao != 2);
		        
		        return opcao;
		    }
		    //Criação do método jogar, que irá controlar todo o jogo, retornando um booleano
		    public boolean Jogar(){
		        if(ganhou() == 0 ){
		            System.out.println("----------------------");
		            System.out.println("Rodada " + rodada);
		            System.out.println("É a vez do jogador: " + vez() );
		            
		            if(vez()==1)
		                jogador1.jogar(tabuleiro);
		            else
		                jogador2.jogar(tabuleiro);
		            
		            
		            if(tabuleiro.tabuleiroCompleto()){
		                System.out.println("Jogo terminou empatado");
		                return false;
		            }
		            vez++;
		            rodada++;

		            return true; //Retorna true, jogo não terminou
		        } else{
		            if(ganhou() == -1 )
		                System.out.println("Jogador 1 -> X, venceu!");
		            else
		                System.out.println("Jogador 2 -> O, venceu!");
		            
		            return false;//Retorna false, jogo termina
		        }
		            
		    }
		    
		    public int vez(){
		        if(vez%2 == 1)
		            return 1;
		        else
		            return 2;
		    }
		    
		    public int ganhou(){
		        if(tabuleiro.checaLinhas() == 1)
		            return 1;
		        if(tabuleiro.checaColunas() == 1)
		            return 1;
		        if(tabuleiro.checaDiagonais() == 1)
		            return 1;
		        
		        if(tabuleiro.checaLinhas() == -1)
		            return -1;
		        if(tabuleiro.checaColunas() == -1)
		            return -1;
		        if(tabuleiro.checaDiagonais() == -1)
		            return -1;
		        
		        return 0;
		    }
		    	    
}


