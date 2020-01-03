package com.company;

public class MatricePonderation {


    private int nbsom;
    public int [][] matrice;


    public MatricePonderation(int nbsom){
        this.nbsom=nbsom;
        matrice=new int[this.nbsom+1][this.nbsom+1];
    }


    public void Remplir(int a,int b,int p){
        try {
            matrice[a][b]=p;
        }
        catch(ArrayIndexOutOfBoundsException index){
            System.out.println("erreur");
        }
    }
}
