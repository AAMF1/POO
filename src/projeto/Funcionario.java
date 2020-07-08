package projeto;

import java.io.Serializable;

/** Classe que extende da classe Pessoa e que cria o objeto funcionario
 */
public class Funcionario extends Pessoa implements Serializable{
    private String tipo;

    /** Construtor para criação de um objeto do tipo docente
     * @param tipo tipo do funcionario (Tempo integral ou tempo parcial)
     * @param nome nome do funcionario
     * @param perfil perfil do funcionario (Boemio, Poupadinho, Cultural ou Desportivo)
     */
    public Funcionario(String tipo, String nome, String perfil) {
        super(nome, perfil);
        this.tipo = tipo;
    }

    /** Método obter o tipo de funcionario
     * @return String - tipo
     */
    @Override
    public String getTipo(){
        return tipo;
    }
    
}
