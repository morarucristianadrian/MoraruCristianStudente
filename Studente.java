/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morarustudente;

/**
 *
 * @author moraru.cristianadria
 */
public class Studente {
    private String nome;
    private String cognome;
    private String indirizzo;
    private String sezione;
    private int anno;
    private int nMaterie;
    private int[] voti;
    /**
     * 
     * @param nome: indica il nome dello studente
     * @param cognome: indica il cognome dello studente
     * @param indirizzo: indica l'indirizzo dello studente
     * @param sezione: indica la sezione dello studente
     * @param anno: indica l'anno dello studente
     * @param nMaterie: indica il numero di materie dello studente
     */
    public Studente(String nome, String cognome, String indirizzo, String sezione, int anno, int nMaterie) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
        this.anno = anno;
        this.nMaterie = nMaterie;
        this.voti = new int[nMaterie];

    }
    /**
     * 
     * @return: mi ritorna il voto
     */
    public int[] getVoti(){
        return this.voti;
    }
     /**
     * 
     * @return: mi ritorna il nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @return: mi ritorna il cognome
     */
    public String getCognome() {
        return cognome;
    }
     /**
     * 
     * @return: mi ritorna l'indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }
    /**
     * 
     * @return: mi ritorna la sezione
     */
    public String getSezione() {
        return sezione;
    }
    /**
     * 
     * @return: mi ritorna l'anno
     */
     public int getAnno() {
        return anno;
    }
    /**
      * 
      * @return: mi ritorna il numero di materie
      */
    public int getNMaterie() {
        return nMaterie;
    }
    /**
     * 
     * @return: mi ritorna le insufficienze
     */
    public int contaInsuff()
    {
        int n=0;
        for(int i = 0; i<voti.length;i++)
        {
            if(voti[i]<6)
            {
                n++;
            }
            
        }
        return n;
    }
    /**
     * 
     * @param v: indica il voto dello studente
     * @return
     */
    public boolean aggiungiVoto(int v)
    {
        
        if(v<1||v>10)
        {
            return false;
        }
        else
        {
            for(int i=0;i<nMaterie;i++)
            {
                if(voti[i]==0)
                {
                    voti[i]=v;
                    return true;
                }
            }
            return false;
            
        }
        
        
    }
    
    public String stampaVoti()
    {
        String valu="";
        for (int i=0;i < nMaterie;i++)
        {
            valu+=(voti[i]);
        }
        return valu;
    }
    
    public int votoPiuAlto()
    {
        int n=0;
        for (int i=0;i < nMaterie;i++)
        {
            if(voti[i]>n)
            {
             n=voti[i]; 
            }
            
        }
        return n;
    }
    
    public int votoPiuBasso()
    {
        int n=11;
        for (int i=0;i < nMaterie;i++)
        {
            if(voti[i]<n)
            {
             n=voti[i]; 
            }
            
        }
        return n;
    }
    
    
    
    public float calcolaMedia()
    {
        int s=0;
        if (voti.length == 0)
        {
            return -1;
        }
        else
        {
          for (int i = 0;i<voti.length;i++)
          {
              s=s+voti[i];
          }  
          return s/voti.length;
            
        }
    }
    
    public boolean isSuff()
    {
        
        if (calcolaMedia()>=6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String descrizione()
    {
        String d="";
        if (calcolaMedia()>=6 && calcolaMedia() <= 7)
        {
            d="lo studente si impegna e si applica abbastanza da arrivare alla sufficieza ma comunque ha delle disattenzioni evidenti";
        }
        else if(calcolaMedia()< 6 && calcolaMedia()>= 4 )
        {
            d="lo studente non si impegna abbastanza da arrivare alla sufficienza ma comunque si nota uno studio e un leggero impegno";
        }
        else if(calcolaMedia()< 4)
        {
            d="lo studente non si impegna per niente e dovrebbe prendere piu' seriamente la scuola!!!";
        }
        else if(calcolaMedia()> 7)
        {
            d="lo studente si impegna tanto e si capisce l'impegno e l'importanza che da alla scuola complimenti!!!"; 
        }
        return d;
    }
    
    
    
    
    @Override
    public String toString() {
        return "nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", sezione=" + sezione + 
                ", anno=" + anno + ", numero materie=" + nMaterie;
    }
}
