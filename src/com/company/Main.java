package com.company;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        //afficherListeFichiers();

        File fichier = new File("fichier.txt");

        ecrireSurFichier(fichier);
        lireFichier(fichier);

    }

    private static void ecrireSurFichier(File fichier) throws FileNotFoundException {
        PrintWriter ecrivain = new PrintWriter(fichier);
        ecrivain.println("test1");
        ecrivain.println("test2");
        ecrivain.println("test3");
        ecrivain.println("test4");
        ecrivain.close();

        if (fichier.exists())
            System.out.println("le fichier " + fichier.getName() + " existe");
        else
            System.out.println("le fichier " + fichier.getName() + " n'existe pas");

        System.out.println("Sa longueur est "+fichier.length());
        System.out.println("Son chemin complet est  \n  "+fichier.getAbsolutePath());
    }

    private static void lireFichier(File fichier) throws IOException {
        FileReader fileReader = new FileReader(fichier);
        BufferedReader br = new BufferedReader(fileReader);
        while (true) {
            String line = br.readLine();
            if (line != null)
                System.out.println(line);
            else
                break;
        }
        fileReader.close();
    }

    private static void afficherListeFichiers() {
        File  repertoire = new File("/Users/jerome/Desktop/");
        for (String fichierName : repertoire.list()){
            System.out.println(fichierName);
        }
    }

}
