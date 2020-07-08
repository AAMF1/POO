package projeto;

import java.io.Serializable;
/** Classe que extende da classe parque e que cria o objeto jardim
 */
public class Jardim extends Parque implements Serializable{
    private int area;
    private int num_inscritos;

    /** Construto para criação de um objeto do tipo jardim
     * @param area area do jardim
     * @param nome nome do jardim 
     * @param altitude coordenada correspondente a altitude do jardim
     * @param latitude coordenada correspondente a latitude do jardim
     */
    public Jardim(int area, String nome, float altitude, float latitude) {
        super(nome, altitude, latitude);
        this.area = area;
    }

    /** Método para obter a area do jardim
     * @return int - area
     */
    public int getArea() {
        return area;
    }
    
    /** Método para obter o numero de inscritos no jardim
     * @return int - num_inscritos
     */
    @Override
    public int getNum_inscritos(){
        return num_inscritos;
    }
    
    /** Método para definir o numero de inscritos no jardim
     * @param num_inscrito numero de inscritos que vai ser definido no jardim
     */
    @Override
    public void setNum_inscritos(int num_inscrito){
        num_inscritos=num_inscrito;       
    }
    
}
