/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morarustudente;

import java.util.Scanner;

/**
 *
 * @author moraru.cristianadria
 */
public class TestStudente {
    public void avvia(){
        Scanner s= new Scanner(System.in);
        System.out.println("Inserisci nome: ");
        String nome=s.nextLine();     
        System.out.println("Inserisci cognome: ");
        String cognome=s.nextLine();
        System.out.println("Inserisci indirizzo: ");
        String indirizzo=s.nextLine();
        System.out.println("Inserisci sezione: ");
        String sezione=s.nextLine();
        System.out.println("Inserisci anno: ");
        int anno=s.nextInt();
        System.out.println("Inserisci numero materie: ");
        int nMaterie=s.nextInt();
        Studente S = new Studente(nome,cognome,indirizzo,sezione,anno,nMaterie);
        Studente S2 = new Studente(nome,cognome,indirizzo,sezione,anno,nMaterie);
        
        
       
       for(int i = 0; i < nMaterie; i++)
       {         
           System.out.println("inserisci voto: ");
           int v = s.nextInt();
           S.aggiungiVoto(v);
       }
       
       System.out.println(s.toString());
       System.out.println(S.stampaVoti());
       System.out.println("\nla media dei voti e': " + S.calcolaMedia());
       System.out.println("il voto piu' alto e': " + S.votoPiuAlto());
       System.out.println("il voto piu' basso e': " + S.votoPiuBasso());
       System.out.println("ci sono: " + S.contaInsuff() + " insufficienze");
       System.out.println("la media dello studete e' sufficiente? : " + S.isSuff());
       System.out.println(S.descrizione()+"\n");
       
       //studente 2
       
        System.out.println("studente 2\n"
                + "");
       
       for(int i = 0; i < nMaterie; i++)
       {
           
           System.out.println("inserisci voto: ");
           int v = s.nextInt();
           S2.aggiungiVoto(v);
       }
       
       System.out.println(s.toString());
       System.out.println(S2.stampaVoti());
       System.out.println("\nla media dei voti e': " + S2.calcolaMedia());
       System.out.println("il voto piu' alto e': " + S2.votoPiuAlto());
       System.out.println("il voto piu' basso e': " + S2.votoPiuBasso());
       System.out.println("ci sono: " + S2.contaInsuff() + " insufficienze");
       System.out.println("la media dello studete e' sufficiente? : " + S2.isSuff());
       System.out.println(S2.descrizione()+"\n");
    }
}
