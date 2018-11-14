package karl_rushford_tp2;

import java.io.*;
import java.util.*;

/************************
cours: IFT1176
TP2 
Karl Rushford



**************************/

public class Auteur implements Comparable<Auteur>
{
   private int code;
   private String nom;
   private String pays;
    
    //declaration du constructeur pour Auteur
    public Auteur(String nom,int code,String pays)
    {
        this.code=code;
        this.nom=nom;
        this.pays=pays;
        
    }

    public int getCode() 
    {
        return code;
    }

    public String getNom() 
    {
        return nom;
    }

    public String getPays() 
    {
        return pays;
    }
    
    public String toString()
    {
        String message =code+nom+pays;
        return message;
    }    

    public int hashCode()
    {
        
        return code;
    }
    public boolean equals(Object o)
    {
        Auteur auteur;
        if (o instanceof Auteur)
        {
                auteur = (Auteur)o;
                if(nom.equals(auteur.nom))
                    return true;
                else
                    return false;
        }
        else
                return false;
    }

    public int compareTo(Auteur a)
    {
            return nom.compareTo(a.getNom());
    }


}
