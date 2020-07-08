package projeto;
import java.io.Serializable;
import java.util.*;

/** Classe que cria o objeto ComunidadeDEI
 */
public class ComunidadeDEI implements Serializable{
    private ArrayList<Pessoa> DEI;
    private ArrayList<Pessoa> convivio;
    private ArrayList<Local> locais_conv;
    private String nome;
    
    /** Construtor para a criação de um objeto do tipo comunidade 
     * @param nome nome da comunidade
     * @param DEI arraylist com as pessoas da comunidade
     * @param locais_conv arraylist com os locais disponiveis para o convivio
     */
    public ComunidadeDEI(String nome, ArrayList<Pessoa> DEI, ArrayList<Local> locais_conv) {
        this.nome = nome;
        this.DEI = DEI;
        this.locais_conv = locais_conv;
        convivio=new ArrayList();
    }
    
     /** Método que verifica se o username ja esta a ser utilizado pelos inscritos
     * @param username username que quer verificar se ja esta a ser utilizado por alguem inscrito no convivio
     *   @return int - retorna 0 se o username nao estiver a ser utilizado e -1 se o username ja existir*/
    public int encontrar_username(String username){
        for(Pessoa c: convivio){
            if(c.getUsername().equals(username))
                return -1;
        }
        return 0;
    }
    /** Método que verifica se uma pessoa do DEI ja esta inscrita no convivio
     * @param pessoa pessoa que quer encontrar no DEI
     *   @return int - retorna 0 se a pessoa nao estiver inscrita e -1 se o username estiver*/
    public int encontrar_pessoa(Pessoa pessoa){
        for(Pessoa c: convivio){
            if(c==pessoa)
                return -1;
        }
        return 0;
    }
    
    /** Método que retorna o arraylist com as pessoas inscritas no convivio

     *   @return ArrayList - convivio*/
    public ArrayList<Pessoa> getConvivio(){
        return convivio;
    }
    
    /** Método que retorna o arraylist com as pessoas da comunidade

     *   @return ArrayList - DEI*/
    public ArrayList<Pessoa> getDEI() {
        return DEI;
    }
    
    /** Método que retorna o arraylist com os locais disponiveis no convivio

     *   @return ArrayList - locais_conv*/
    public ArrayList<Local> getLocais_conv() {
        return locais_conv;
    }
    
    /** Método para retorno do nome do convivio

     *   @return String - Nome*/
    public String getNome() {
        return nome;
    }

    /** Método que retorna um inteiro que ira da a informacao se uma pessoa se pode inscrever no convivio, e se nao o porque de nao poder
     * @param pessoa pessoa que quer ser inscrita
     * @param username username que quer usar para inscriçao
     * @param password password que quer usar para inscriçao
     * @return int - retorna 0 se foi inscrita retorna 0, -1 se a pessoa nao esta inserida na comunidade, -2 se o username ja esta a ser
     * utilizado por alguem no convivio e por fim -3 se a pessoa ja esta inscrita no convivio*/
    public int inscricao(Pessoa pessoa, String username, String password){
        int a=0, b=0;
        for(Pessoa c: DEI){
            if(pessoa.getNome().equals(c.getNome())){
                a=encontrar_username(username);
                b=encontrar_pessoa(pessoa);
                if(b==0){
                    if(a==0){
                        pessoa.setUsername(username);
                        pessoa.setPassword(password);
                        convivio.add(pessoa);
                        return 0;
                    }
                    else
                        return -2;
                }
                else
                    return -3;
            }
        }
        return -1;
    }    
}
