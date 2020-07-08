package projeto;
import java.io.*;

/** Classe que cria o ficheiro de objetos caso nao exista, carrega o estado atual do programa e quando é encerrado
 * guarda o mesmo.
 */
public class FicheirosDeObjetos implements Serializable{
    private ObjectInputStream iS;
    private ObjectOutputStream oS;
    
    /** Método para guardar o estado atual do programa antes de este ser encerrado
     * @param fich_obj ficheiro de objetos onde esta guardada o convivio
     * @param Dei objeto com as pessoas do convivio, as pessoas da comunidade e os locais do convivio
     * @throws java.io.IOException
     */
    public void saveObjetos(String fich_obj, ComunidadeDEI Dei) throws IOException{
        try {
            oS = new ObjectOutputStream(new FileOutputStream(fich_obj));
            oS.writeObject(Dei);
            oS.close();
        } catch (IOException ex) {
            System.out.println("Ocorreu uma excecao "+ex);
        }
    }
    
    /** Método para resumir o estado do programa antes de ser encerrado
     * @param fich_obj ficheiro de objetos onde esta guardada o convivio
     * @return Dei objeto com as pessoas do convivio, as pessoas da comunidade e os locais do convivio
     * @throws java.io.IOException
     */
    public ComunidadeDEI loadObjetos(String fich_obj) throws IOException{
        ComunidadeDEI Dei=null;
        try {
            iS = new ObjectInputStream(new FileInputStream(fich_obj));
            Dei = (ComunidadeDEI) iS.readObject();
            iS.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Ocorreu uma excecao "+ex);
        }
        return Dei;
    }
}
