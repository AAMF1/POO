package projeto;
import java.io.Serializable;
import java.util.ArrayList;

/** Classe onde e criado o objeto do tipo local
 */
public class Local implements Serializable{
    private String nome;
    private float altitude;
    private float latitude;
    private int num_inscritos;
    ArrayList <Pessoa> lista_inscritos;
    
    /** Construto para criação de um objeto do tipo local
     * @param nome nome do local
     * @param altitude coordenada correspondente a altitude do local
     * @param latitude coordenada correspondente a latitude do local
     */
    public Local(String nome, float altitude, float latitude) {
        this.nome = nome;
        this.altitude = altitude;
        this.latitude = latitude;
        lista_inscritos=new ArrayList();
    }

    /** Método para obter o nome do local
     * @return String - nome
     */
    public String getNome(){
        return nome;
    }

    /** Método para obter a altitude
     * @return float - altitude
     */
    public float getAltitude(){
        return altitude;
    }
    
    /** Método para obter lista de inscritos (usado por questões de polimorfismo, apenas relevante em bares)
     * @return null
     */
    public ArrayList<Pessoa> getLista_inscritos(){
        return null;
    }

    /** Método para obter latitude
     * @return float - latitude
     */
    public float getLatitude(){
        return latitude;
    }

    /** Método obter o numero de inscritos (declarado por questões de polimorfismo)
     * @return 0
     */
    public int getNum_inscritos(){
        return 0;
    }
    
    /** Método para obter o numero de alunos (declarado por questões de polimorfismo)
     * @return 0
     */
    public int getNum_alunos(){
        return 0;
    }
    
    /** Método para obter o numero de "nao alunos" (declarado por questões de polimorfismo)
     * @return 0
     */
    public int getNum_nao_alunos(){
        return 0;
    }
    
    /** Método para definir o numero de "nao alunos" (declarado por questões de polimorfismo)
     * @param num_nao_alunos numero de nao alunos a definir nas exposiçoes
     */
    public void setNum_nao_alunos(int num_nao_alunos){       
    }
    
    /** Método para definir o numero de alunos (declarado por questões de polimorfismo)
     * @param num_alunos numero de alunos a definir nas exposiçoes
     */
    public void setNum_alunos(int num_alunos){
    }
    
    /** Método para definir o numero de inscritos (declarado por questões de polimorfismo)
     * @param num_inscrito numemor de inscritos a definir nos bares/parques
     */
    public void setNum_inscritos(int num_inscrito){            
    }
    
    /** Método para obter o tipo, relativo às exposições (declarado por questões de polimorfismo)
     * @return String
     */
    public String getTipo() {
        return "";
    }
    
    /** Método que retorna a lotaçao de um local
     * @return int - a lotaçao do local
     */
    public int getLotacao() {
        return 0;
    }

    /** Método para obter consumo minimo no caso dos bares (declarado por questões de polimorfismo)
     * @return 0
     */
    public float getCons_minimo() {
        return 0;
    }
    
    /** Método para obter desportos no caso das areas desportivas (declarado por questões de polimorfismo)
     * @return null
     */
    public ArrayList<String> getDesportos() {
        return null;
    }
    
    /** Método para obter receitas, no caso dos bares e exposições (declarado por questões de polimorfismo)
     * @return 0
     */
    public float receita(){
        return 0;
    }
    
    /** Método para inscrever pessoas nos locais (declarado por questões de polimorfismo)
     * @param pessoa pessoa que vai ser adicionada na lista de inscritos do local
     */
    public void add_lista(Pessoa pessoa){
    }
    
    /** Método para remover pessoas dos locais (declarado por questões de polimorfismo)
     * @param pessoa pessoa que vai ser removida na lista de inscritos do local
     */
    public void remove_lista(Pessoa pessoa){
    }
  
}