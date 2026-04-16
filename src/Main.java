import java.util.Scanner;
import service.TranslatorService;
import tree.BinaryTree;
import util.FileUtil;

public class Main {

    public static void main(String[] args) {

        BinaryTree<String, String> tree = new BinaryTree<>();

        FileUtil.cargarDiccionario("diccionario.txt", tree);

        System.out.println("Diccionaro ordenado");
        tree.inOrder();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese texto a traducir:");
        String texto = sc.nextLine();

        TranslatorService translator = new TranslatorService(tree);

        System.out.println("\nTraducción");
        translator.traducir(texto);
    }
}
