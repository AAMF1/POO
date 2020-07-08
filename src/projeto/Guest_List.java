package projeto;

import java.util.ArrayList;

/** Classe que representa a guestlist de um bar
 */
public class Guest_List{
    ArrayList<Pessoa> guest_list;
    Local bar;

    /** Construtor para criação de um objeto do tipo guest_list
     * @param local local onde se vai fazer a guestlist
     */
    public Guest_List(Local local) {
        this.bar= local;
        guest_list = new ArrayList((int)(bar.getLotacao()*0.2));
    }
    
    /** Método para criação de uma guest-list para o bar associado
     * @return ArrayList - guest-list
     */
    public ArrayList<Pessoa> create_guest(){
        int max_guest = (int) (bar.getLotacao()*0.2);
        for(Pessoa c: bar.getLista_inscritos()){
            if(guest_list.size() < max_guest){
                if("Boemio".equals(c.getPerfil())){
                    guest_list.add(c);
                }
            }
        }
        for(Pessoa c: bar.getLista_inscritos()){
            if(guest_list.size() < max_guest){
                if(!"Boemio".equals(c.getPerfil())){
                    guest_list.add(c);
                }
            }
        }
        if(guest_list.size()<1){
            return null;
        }
        return guest_list;       
    }
}
