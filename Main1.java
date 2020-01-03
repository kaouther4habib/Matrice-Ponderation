package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int inf=10000000;
        int nbsom,nbarc,p=1;
        int i=1,j,k;
        int a=0,b=0;
        int type=-1;
        MatricePonderation matrice;



        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("si le graphe est oriente ecrire 1 , si non oriente ecrire 0 :");

            while (type != 0 && type != 1) {

                type = sc.nextInt();
                if (type != 0 && type != 1){
                    System.out.println("erreur");
                }
            }
            System.out.print("ecrire le nombre de sommets: ");
            nbsom = sc.nextInt();
            System.out.print("ecrire le nombre d'arcs : ");
            nbarc = sc.nextInt();

            MatricePonderation mat = new MatricePonderation(nbsom);

            for (j=1;j<=nbsom;j++)
            {
                for (k=1;k<=nbsom;k++)
                {
                    if(j!=k)
                        mat.matrice[j][k]=inf;
                }
            }


            while (i<=nbarc){

                System.out.print("1er sommet:  ");
                a = sc.nextInt();
                System.out.print("2eme sommet : ");
                b = sc.nextInt();
                System.out.print("ecrire la ponderation:  ");
                p = sc.nextInt();
                mat.Remplir(a,b,p);
                if (type == 0)
                    mat.Remplir(b,a,p);
                i++;
            }


            System.out.println("Matrice de Ponderation");

            for (j=1;j<=nbsom;j++)




                for (j=1;j<=nbsom;j++)
                {

                    for (k= 1;k<=nbsom;k++){
                        if (mat.matrice[j][k]==inf){
                            System.out.print("∞" );
                        }
                        else{
                            System.out.print(mat.matrice[j][k] );
                        }
                    }

                    System.out.println();
                }

        }
        catch (Exception E)
        {
            System.out.println("erreur");
        }

        sc.close();
    }

}

