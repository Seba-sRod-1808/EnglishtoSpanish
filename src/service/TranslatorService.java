  package service;

import tree.BinaryTree;

public class TranslatorService {

    private BinaryTree<String, String> tree;

    public TranslatorService(BinaryTree<String, String> tree) {
        this.tree = tree;
    }

    public void traducir(String texto) {

        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {

            String limpia = palabra.toLowerCase().replaceAll("[^a-z]", "");

            String traduccion = tree.search(limpia);

            if (traduccion != null) {
                System.out.print(traduccion + " ");
            } else {
                System.out.print("*" + palabra + "* ");
            }
        }
    }
}
