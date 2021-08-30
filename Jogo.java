/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author wwfil
 */ import java.util.Scanner;
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cavaleiro knight = new Cavaleiro();
        System.out.println("Historinha de RPG: \n");
        System.out.println("OBS: Cavaleiro é um título dado pra todo mundo que se inscreve na Guilda pra ser um aventureiro.\n");
        
        knight.nome = "Cavaleiro Azul";
        knight.nivel = 1;
        knight.vida = 50;
        knight.vigor = 100.0;
        knight.mana=100.0;
        
        knight.nomedoknight("Mestre");
        
        System.out.println("*Seus dados de conta \n nome: " +knight.nome+ "\n Nível: " +knight.nivel+"\n Vida: " +knight.vida +"\n Mana: "+knight.mana+ "\n Vigor: "+ knight.vigor+ "*\n\n");
        
        
        knight.dano = 30;
        System.out.println("Pra começar a história, lá vai um clássico tutorial contra uma slime. \n\n*Começo do combate* \n*você tira 8 em um D20 e perde " + knight.dano + " de vida. Total de vida: ");
        
        knight.danorecebido(knight.dano); 
        System.out.print("*\n\n");
        knight.recuperar(10);
        System.out.print("\n");
        
        knight.perdaDeVigor=43.89;
        System.out.println("Você ataca o Slime e o mata com um único hit, mas perde "+knight.perdaDeVigor+" de virgor, o mesmo descança...");
        knight.descansar(45.01);
        System.out.print("\n");
        knight.upar(knight.nivel);
        
        
        //Construtor NÃO parametrizado
        Cavaleiro knight2 = new Cavaleiro();
        System.out.println("\n\nContinuação...\n\n");
        knight2.nome = "Cavaleiro Verde";
        System.out.println("Após matar o slime, o " +knight.nome+ " encontrou um novo companheiro chamdo " +knight2.nome+", como ambos enstavam dentro de uma caverna de trinamento, decidiram se ajudar pra sair daquele lugar, cavaleiros com espadas longas não se dão bem em locais apertados ");
        System.out.print("como cavernas.");
        System.out.print(" Mas para terem mais confiança uns nos outros, ambos decidiram mostrar os status de suas respectivas contas: ");
        knight2.nivel = 4; 
        knight2.vigor= 100;
        knight2.vida = 80;
        knight2.mana=120.0;
        System.out.println("\n\n*Dados da conta de seu(sua) companheiro(a) \n nome: " +knight2.nome+ "\n Nível: " +knight2.nivel+"\n Vida: " +knight2.vida + "\n Mana: "+knight2.mana+ "\n Vigor: "+ knight2.vigor+ "*\n\n");
        System.out.println("Antes que eles podessem se conhecer melhor, uma orda de slimes apareceu! Ambos os cavaleiros se separaram para começar o combate.");
        knight2.dano=30;
        System.out.print("*O "+knight.nome+" consegue tirar um 18 de um D20, já o "+knight2.nome+" tirou um 12 do mesmo dado.(O " +knight2.nome+ " leva "+knight2.dano+" de dano, vida restante: ");
        knight2.danorecebido(knight2.dano);
        System.out.print("*)\n");
        knight2.manaGasta=107.52;
        System.out.print("Para se livrarem daquela lastimável situação o "+knight2.nome+" usou o seu ataque mais forte, mas que consomiria 89.6% de sua mana (Mana restante: ");
        knight2.manaSeEsgotando(knight2.manaGasta);
        System.out.print(")");
        System.out.println("");
        knight2.upar(knight2.nivel);
        System.out.println("\n");
        
        
        
        
        
        //Construtor parametrizado
        Cavaleiro maga = new Cavaleiro("Maga carmesin", 7, 35.8, 30, 165.5 );
         System.out.print("(Porfavor volte na obs)");
        System.out.println("\nApós aquela terrível batalha o "+knight2.nome+" está esgotado, mas o "+knight.nome+" estava lá e o ajudou, por conta do ataque que eles tinham causado, o som ecoou na caverna inteira, chamando a atenção de uma maga que estava na mesma situação que os outros...");
        System.out.println("A maga chega perto deles de forma silenciosa e, pra ela, muito furtiva, mas por conta de sua inexperiência de combate ela acaba se assustando com pequenos slimes da horda que estavam fugindo do ataque anterior, chamando a atenção dos cavaleiros.");
        System.out.println("Seu rosto coberto de medo muda para uma feição envergonhada, dada a situação do seu susto por um mero Slime, ela estende o seu trêmulo cajado em direção à eles, mas ambos os cavaleiros percebem a situação e começam a rir e acalmar a maga, que fica brava ");
        System.out.println("e com seu rosto corado. ");
        System.out.println("Após o susto inicial, a maga explica sua situação e pede ajuda à eles, como o objeitvo dos três era o mesmo, de sair da caverna, eles decidiram que iriam se ajudar, para isso ela mostrou os seus Status de perosnagem à eles: ");
        System.out.print("\n*Dados de conta de seu(sua) companheiro(a) \n nome: ");
                System.out.print(maga.nome); 
        System.out.print("\n Nível: "); 
                System.out.print(maga.nivel);
        System.out.print("\n Vida: "); 
                System.out.print(maga.vida); 
        System.out.print("\n Mana: ");
                System.out.print(maga.mana); 
        System.out.print("\n Vigor: ");
                System.out.print(maga.vigor); 
        System.out.print("*\n\n");
        System.out.println("Mas o momento de se conhecer tinha que ficar para outra hora, pois um inimigo terrívelmente forte apareceu, esse inimigo era um ser que eles nunca tinham visto, era escamoso semelhante a um dragão, mas não era um, se não eles já teriam reconhecido...");
        System.out.println("Mas os dois estavam esgotados, um tinha acabado de começar o jogo e estava sem recursos, o segundo usou o seu ataque mais forte e estava fraco de mais para poder ajudar, o que só sobra pra nova integrante do grupo...");
        System.out.println("Uma menina que amava ataques explosivos, nesse momento o seu grande chapéu carmesin cobria parte de seu rosto enquanto a mesma ria na frente do mosntro mais forte da caverna, quando ela pegou em sua capa e a arremessou para o lado");
        System.out.println("Segurando firme em seu cajado a pequena começa a pronunciar uma incrível magia, fazendo seus olhos brilharem em fortes e vívidas cores carmesin e seu cajado infinitas cores  através de um círculo mágico, porém esse feitiço a causava grandes prejuízos (recoil) e");
        System.out.println("uma perda gigantesca de mana e vigor, o que a fazia desmaiar, porém ela se esqueceu que todos estavam dentro da caverna, o que resultou em que não só o mosntro, mas que todos eles recebecem danos absurdos, resultando na morte de todos dentro da caverna.");
        System.out.println("Essa foi a História de 3 Aventureiros que morreram no tutorial de um jogo.");
        
        System.out.println("\n\nFim do RPGzin, obrigado por jogar.");
         
    }
    
}
