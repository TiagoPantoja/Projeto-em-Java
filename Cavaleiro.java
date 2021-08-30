/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author wwfil
 */
public class Cavaleiro {
    //Atributos:
    String nome;
    int nivel;
    double vigor;
    double perdaDeVigor;
    int vida;
    int dano;
    int vidaQueSobrou;
    double mana;
    double manaGasta;
    double manaQueSobrou;
    
    //Métodos:
    void recuperar (int recuperacao) {
        this.vida += recuperacao;
        System.out.println ("Cavaleiro toma poção para regenerar vida e ele regenera: " + recuperacao + " de vida. Sua vida atual: "+ vida);
    }
    void descansar (double descanco) {
        if(this.perdaDeVigor > this.vigor){
            this.vigor-=this.perdaDeVigor;
            System.out.println("O seu personagem perdeu muito vigor, perdeste um turno *A quantidade de Vigor atual é:"+vigor+"*");
        }
        else if(this.perdaDeVigor < this.vigor){
        this.vigor-=this.perdaDeVigor;
        this.vigor += descanco;
        if(this.vigor > 100){
            this.vigor=100;
        }
        System.out.println ("O cavaleiro regenera " + descanco+ " de vigor. *Quantidade de vigor atual: " + vigor +"*");
    }
    }
    void upar (int evolucao) {
        this.nivel += 1; 
        System.out.println ("Após a batalha o Cavaleiro sobe de nível: " + evolucao + " -> " + nivel);
    }
    void nomedoknight (String nomedocara){  
        System.out.println("O meu nome de personagem da classe Cavaleiro: " + this.nome); 
        System.out.println("\n -Esse nome é legal eu sou o narrador e meu nome é: " + nomedocara +"\n\n");
    }
    void danorecebido(int danolevado){
        if (this.vida<this.dano){
            System.out.println("Sua vida chegou a Zero! O seu personagem morreu! \n JOGO ENCERRADO!");
            System.exit(0);
        }
        else if(this.vida>this.dano){
            vidaQueSobrou=this.vida-this.dano;
            vida=vidaQueSobrou;
            System.out.print(vidaQueSobrou);
        }
    }
    void manaSeEsgotando(double menosMana){
        if (this.mana<this.manaGasta){
            System.out.println("Você não conseguiu usar o seu poder, pois não tem mana o suficiente.");
        }
        else if(this.mana>this.manaGasta){
            manaQueSobrou=this.mana-this.manaGasta;
            mana=manaQueSobrou;
            System.out.print(manaQueSobrou);
        }
    }
    
    

    //Construtores:
    public Cavaleiro() { // Não parametrizado
    }

    public Cavaleiro(String nome, int nivel, double vigor, int vida, double mana) {
        this.nome = nome;
        this.nivel = nivel;
        this.vigor = vigor;
        this.vida = vida;
        this.mana = mana;
        
    }
    
    
    
   
    

    
}
