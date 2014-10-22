package contar_lletres;

import java.util.Scanner;

public class Contar_lletres {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        String frase = lector.nextLine();

        Contar_lletres programa = new Contar_lletres();
        programa.ContarLletres(frase);


    }


    public void ContarLletres(String frase){
        char lletres [] = {'a','b','c','d','e','f','g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int aparicionsLletra = 0;
        for(int i = 0; i<lletres.length;i++){
            int naparicions = Aparicions(lletres[i], frase);
            if(naparicions != 0){
                System.out.print("La lletra '" + lletres[i] + "' apareix ");
                System.out.print(naparicions);
                System.out.println();
            }


        }
    }

    public int Aparicions(char lletra, String frase){
        int naparicions = 0;
        for(int i = 0; i<frase.length();i++){
            if(frase.charAt(i)==lletra){
                naparicions++;
            }
        }
        return naparicions;
    }

}
