package projeto;

import java.io.Serializable;

/** Classe que extende da classe Pessoa e que cria o objeto docente
 */
public class Docente extends Pessoa implements Serializable{
    private String tipo;

    /** Construtor para a criação de um objeto do tipo docente
     * @param tipo tipo de docente (Catedratico, Associado ou Auxiliar)
     * @param nome nome do docente
     * @param perfil perfil do docente (Boemio, Poupadinho, Cultural ou Desportivo
     */
    public Docente(String tipo, String nome, String perfil) {
        super(nome, perfil);
        this.tipo = tipo;
    }
    
    /** Método para obter o tipo de docente 
     * @return String - tipo
     */
    @Override
    public String getTipo(){
        return tipo;
    }
    
    
}
