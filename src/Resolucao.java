import java.awt.Toolkit;
import java.awt.Dimension;
public class Resolucao {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = tamanhoTela.width;
        int altura = tamanhoTela.height;
        System.out.println("Sua resolução atual é " + largura + " x " + altura);
    }
}
