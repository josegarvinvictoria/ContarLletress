package contar_lletresOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO Comentari de prova!

        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        String frase = lector.nextLine();

        ArrayList<Lletres> lletres = new ArrayList<>();

        for(int i = 0; i<frase.length();i++){
            Lletres lletra = new Lletres(frase.charAt(i));
            int pos = lletres.indexOf(lletra);
            if(pos != -1){
                lletres.get(pos).Incrementa();
            	
            }else{
                lletres.add(lletra);
                
            }

        }

        for(int i = 0; i<lletres.size();i++){
            System.out.println("La lletra " + lletres.get(i).getLletra() + " apareix " + lletres.get(i).getAparicions() + " vegades.");
        }

    }

}
