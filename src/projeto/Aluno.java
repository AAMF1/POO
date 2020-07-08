package projeto;

import java.io.Serializable;

/** Classe que extende da classe Pessoa e que cria o objeto aluno
 */
public class Aluno extends Pessoa implements Serializable{
    private String curso;
    
    /** Construtor para a criação de um objeto do tipo aluno
     * @param curso curso do aluno 
     * @param nome nome do aluno
     * @param perfil perfil do aluno (Boemio, Poupadinho, Cultural ou Desportivo)
     */
    public Aluno(String curso, String nome, String perfil) {
        super(nome, perfil);
        this.curso = curso;
    }
    
    /** Método para retornar curso
     * @return String - curso
     */
    @Override
    public String getCurso(){
        return curso;
    }
}