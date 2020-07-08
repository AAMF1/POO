package projeto;
import java.io.Serializable;
import java.util.*;

/** Classe que extende da classe Local e que cria o objeto bar
 */
public class Bar extends Local implements Serializable{
    private int lotacao;
    private float cons_minimo;
    private int num_inscritos;
    ArrayList<Pessoa> lista_inscritos;
    
    /** Construtor para a criação de um objeto do tipo bar
     * @param lotacao lotaçao do bar
     * @param cons_minimo consumo minimo do bar
     * @param nome nome do bar
     * @param altitude coordenada correspondente a altitude do bar
     * @param latitude coordenada correspondente a latitude do bar
     */
    public Bar(int lotacao, float cons_minimo, String nome, float altitude, float latitude) {
        super(nome, altitude, latitude);
        this.lotacao = lotacao;
        this.cons_minimo = cons_minimo;
        lista_inscritos=new ArrayList(lotacao);
    }
    
    /** Método para obter a lotacao do bar
     * @return int - lotacao
     */
    @Override
    public int getLotacao() {
        return lotacao;
    }

    /** Método para obter o consumo minimo do bar
     * @return float - cons_minimo
     */
    @Override
    public float getCons_minimo() {
        return cons_minimo;
    }

    /** Método para obter o numero de inscritos através dio tamanho da lista de incritos no bar
     * @return int - lista_inscritos.size()
     */
    @Override
    public int getNum_inscritos(){
        return lista_inscritos.size();
    }
    
    /** Método para obter a receita relativa ao bar (numero de inscritos * consumo minimo)
     * @return float lista_inscritos.size()*cons_minimo
     */
    @Override
    public float receita(){
        return (float) lista_inscritos.size()*cons_minimo;
    }
    
    /** Método para obter a lista de inscritos do bar
     * @return ArrayList - lista_inscritos
     */
    @Override
    public ArrayList<Pessoa> getLista_inscritos(){
        return lista_inscritos;
    }
    
    /** Método que adiciona uma pessoa à lista de inscritos do bar (inscreve essa pessoa no bar) 
     * @param pessoa
     */
    @Override
    public void add_lista(Pessoa pessoa){
        lista_inscritos.add(pessoa);
    }
    
    /** Método que remove uma pessoa da lista de inscritos do bar (desinscreve essa pessoa do bar)
     * @param pessoa
     */
    @Override
    public void remove_lista(Pessoa pessoa){
        lista_inscritos.remove(pessoa);
    }

}
