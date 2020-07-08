package projeto;
import java.io.Serializable;
import java.util.*;

/** Classe que extende da classe parque e que dá origem as areas desportivas
 */
public class AreaDesportiva extends Parque implements Serializable{
    ArrayList<String> desportos;
    private int num_inscritos;

    /** Construtor para a criação de uma área desportiva
     * @param desportos desportos disponiveis na area
     * @param nome nome da area
     * @param altitude coordenada correspondente a altitude da area
     * @param latitude coordenada correspondente a latitude da area
     */
    public AreaDesportiva(ArrayList<String> desportos, String nome, float altitude, float latitude) {
        super(nome, altitude, latitude);
        this.desportos = desportos;
    }

    /** Método para retornar desportos 
     * @return ArrayList - desportos
     */
    @Override
    public ArrayList<String> getDesportos() {
        return desportos;
    }
    
    /** Método para obter o numero de inscritos 
     * @return int - inscritos
     */
    @Override
    public int getNum_inscritos(){
        return num_inscritos;
    }
    
    /** Método para definir o numero de inscritos 
     */
    @Override
    public void setNum_inscritos(int num_inscrito){
        num_inscritos=num_inscrito;       
    }
}
