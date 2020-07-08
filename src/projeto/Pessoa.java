package projeto;
import java.io.Serializable;
import java.util.*;

/** Classe que cria o objeto pessoa
 */

public class Pessoa implements Serializable{
    private String nome;
    private String perfil;
    private String username;
    private String password;
    private ArrayList<Local> locais;
    
    /** 
     * Construtor para criação de um objeto do tipo pessoa
     * @param nome nome da pessoa
     * @param perfil perfil da pessoa (Boemio, Poupadinho, Cultural ou Desportivo)
     */
    public Pessoa(String nome, String perfil) {
        this.nome = nome;
        this.perfil=perfil;
        locais= new ArrayList<>(4);
    }
    
    /**
    * Método para retorno do nome da pessoa
    * @return String - Nome
    */
    public String getNome() {
        return nome;
    }
    
    /**
    * Método para retorno o username da pessoa
    *@return String - username*/
    public String getUsername() {
        return username;
    }

    /** 
     * Método para retorno o password da pessoa
     *   @return String - passowrd
     */
    public String getPassword() {
        return password;
    }
    
    /**
    * Método para retorno o tipo da pessoa
    *@return String - Nome*/
    public String getTipo(){
        return "";
    }
    
    /** 
     * Método para retorno o curso da pessoa caso seja aluno
    *@return String - curso
    */
    public String getCurso(){
        return "";
    }
    
    /** 
     * Método para retorno o perfil da pessoa
     *   @return String - perfil
     */
    public String getPerfil(){
        return perfil;
    }

    /** 
     * Método para definir o username da pessoa
     * @param username - usenarme a colocar
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /** 
     * Método para definir a password da pessoa
     * @param password - password a colocar
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** 
    * Método que retorna o arraylist com os locais do convivio em que a pessoa esta inscrita
    *   @return ArrayList - locais
    */
    public ArrayList<Local> getLocais() {
        return locais;
    }
    
    /** 
     * Método que remove um local da lista de locais onde a pessoa esta inscrita
     * @param local local a remover
     */
    public void remove_local(Local local){
        int num_nao_alunos=local.getNum_nao_alunos();
        int num_alunos=local.getNum_alunos();
        int num_inscritos=local.getNum_inscritos();
        for(Local c: locais){
            if(c.getNome().equals(local.getNome())){
                if(local.getLotacao()!=0){
                    locais.remove(local);
                    local.remove_lista(this);
                    break;
                    }
                }
                else if(!local.getTipo().equals("")){
                    if(!getCurso().equals("")){
                        locais.remove(local);
                        num_alunos--;
                        local.setNum_alunos(num_alunos);
                        break;
                    }
                    else{
                        locais.remove(local);
                        num_nao_alunos--;
                        local.setNum_nao_alunos(num_nao_alunos);
                        break;
                    }
                }
                else{
                    locais.remove(local);
                    num_inscritos++;
                    local.setNum_inscritos(num_inscritos);               
                }
            }
    }
    
    /** Método que adiciona um local da lista de locais a lista  de locais em que a pessoa esta inscrita
     * @param local local a adicionar
     * @return int- -2 significa que a pessoa ja esta inscrita no local, -3 significa que a pessoa ja se inscreveu no maximo de locais
     * possivel, 0 significa que foi inscrito no local com sucesso e por fim -1 caso ocorra algum erro.
     */
    public int add_local(Local local){
        int num_nao_alunos=local.getNum_nao_alunos();
        int num_alunos=local.getNum_alunos();
        int num_inscritos=local.getNum_inscritos();
        for(Local c: locais){
            if(c.getNome().equals(local.getNome()))
                return -2;
        }
        if (locais.size()>=5){
                return -3;
        }
        else{
            if(local.getLotacao()!=0){
                if(local.lista_inscritos.size()<local.getLotacao()){
                    locais.add(local);
                    local.add_lista(this);
                    return 0;
                }
                else
                    return -1;             
            }
            else if(!local.getTipo().equals("")){
                if(!getCurso().equals("")){
                    locais.add(local);
                    num_alunos++;
                    local.setNum_alunos(num_alunos);
                    return 0;
                }
                else{
                    locais.add(local);
                    num_nao_alunos++;
                    local.setNum_nao_alunos(num_nao_alunos);
                    return 0;
                }
            }
            else{
                locais.add(local);
                num_inscritos++;
                local.setNum_inscritos(num_inscritos);
                return 0;
            }        
        }
    }
}
