package projeto;

import java.io.Serializable;

/** Classe abstrata que dá origem aos jardins e areas desportivas
 */
public class Parque extends Local implements Serializable{
    /** Construto para criação de um objeto do tipo parque
     * @param nome nome do parque
     * @param altitude coordenada correspondente a altitude do parque
     * @param latitude coordenada correspondente a latitude do parque
     */
    public Parque(String nome, float altitude, float latitude) {
        super(nome, altitude, latitude);
    }
    
}
