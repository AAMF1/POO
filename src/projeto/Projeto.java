package projeto;
import java.io.*;
/**
 *Classe onde se incializa o programa
 */
public class Projeto {
    /**Classe principal, para incializar o necessário ao funcionamento do programa

        * @author Alexandre Ferreira e Guilherme Pontes
        * @version 1.05
        * @param args argumentos    
        * @throws java.io.IOException caso de erro  
        */
    public static void main(String[] args) throws IOException {
        File f = new File("fich_obj.dat");
        if (f.isFile()) {
            ComunidadeDEI dei;
            FicheirosDeObjetos fich_obj = new FicheirosDeObjetos();
            dei=fich_obj.loadObjetos("fich_obj.dat");
            new MenuPrincipal(dei).setVisible(true);
        } else{
            Ficheiros fich=new Ficheiros();
            fich.loadAlunos("Alunos.txt");
            fich.loadDocentes("Docentes.txt");
            fich.loadFuncionarios("Funcionarios.txt");
            fich.loadLocais("Locais.txt");
            ComunidadeDEI dei= new ComunidadeDEI("DEI", fich.getDEI(), fich.getLocais());
            new MenuPrincipal(dei).setVisible(true);
        }
    }   
}