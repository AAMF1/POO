package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/** Classe que extende da classe Local e que cria o objeto exposiçao
 */
public class Exposicao extends Local implements Serializable{
    private String tipo;
    private float cons_minimo;
    private int num_nao_alunos=0;
    private int num_alunos=0;
    
    /** Construtor para criação de um objeto do tipo exposição
     * @param tipo tipo da exposiçao(arte, escultura,...)
     * @param cons_minimo consumo minimo da exposiçao
     * @param nome nome da exposiçao
     * @param altitude coordenada correspondente a altitude da exposiçao
     * @param latitude coordenada correspondente a latitude da exposiçao
     */
    public Exposicao(String tipo, float cons_minimo, String nome, float altitude, float latitude) {
        super(nome, altitude, latitude);
        this.tipo = tipo;
        this.cons_minimo = cons_minimo;
        lista_inscritos=new ArrayList();
    }

    /** Método para obter o tipo de exposição
     * @return String - tipo
     */
    @Override
    public String getTipo() {
        return tipo;
    }

    /** Método para obter o preço da exposição
     * @return float - cons_minimo
     */
    @Override
    public float getCons_minimo() {
        return cons_minimo;
    }

    /** Método para definir o numero de não alunos (facilita o calculo de descontos a alunos)
     * @param num_nao_alunos numero de nao alunos que vais ser definido na exposiçao
     */
    @Override
    public void setNum_nao_alunos(int num_nao_alunos) {
        this.num_nao_alunos = num_nao_alunos;
    }
    
    /** Método para definir o numero de alunos (facilita o calculo de descontos a alunos)
     * @param num_alunos numero de alunos inscritos que vai ser definido na exposiçao
     */
    @Override
    public void setNum_alunos(int num_alunos) {
        this.num_alunos=num_alunos;
    }

    /** Método para obter o numero de "não alunos"
     * @return int - num_nao_alunos
     */
    @Override
    public int getNum_nao_alunos() {
        return num_nao_alunos;
    }
    
    /** Método para obter o numero de inscritos (soma dos alunos com os "não alunos")
     * @return int - num_inscritos
     */
    @Override
    public int getNum_inscritos(){
        return num_nao_alunos+num_alunos;
    }
    
    /** Método para obter o numero de alunos
     * @return int - num_alunos
     */
    @Override
    public int getNum_alunos() {
        return num_alunos;
    }
    
    /** Método para obter a receita (numero de inscritos multiplicado pelo preço da exposição tendo em atenção 10% de desconto a alunos)
     * @return float - (num_nao_alunos*cons_minimo+num_alunos*(cons_minimo*0.9));
     */
    @Override
    public float receita(){
        return (float) (num_nao_alunos*cons_minimo+num_alunos*(cons_minimo*0.9));
    }
 
}
