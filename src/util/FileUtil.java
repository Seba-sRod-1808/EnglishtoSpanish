package util;

import model.Association;
import tree.BinaryTree;

import java.io.*;

public class FileUtil {

    public static void cargarDiccionario(String path, BinaryTree<String, String> tree) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.replace("(", "").replace(")", "");
                String[] parts = line.split(",");

                String key = parts[0].trim().toLowerCase();
                String value = parts[1].trim().toLowerCase();

                tree.insert(new Association<>(key, value));
            }

        } catch (Exception e) {
            System.out.println("Error leyendo diccionario");
        }
    }
}
