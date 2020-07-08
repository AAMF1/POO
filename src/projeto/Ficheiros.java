package projeto;

import java.io.*;
import static java.lang.Float.parseFloat;
import java.util.*;

/** Classe que le os ficheiros texto e cria os arraylists de pessoas e locais que serviram de parametro para a
 * criaçao do objeto ComunidadeDEI
 */

public class Ficheiros {
    private BufferedReader fR;
    private BufferedWriter fW;
    ArrayList<Pessoa> DEI= new ArrayList();
    ArrayList<Local> locais_conv = new ArrayList();
    
    /** Método para carregar os alunos inseridos no ficheiro .txt para o programa
     * @param fich nome do ficheiro dos alunos
     * @throws java.io.IOException caso de erro  
     */
    public void loadAlunos(String fich) throws IOException{
        fR = new BufferedReader(new FileReader(fich));
        String linha;
        while((linha=fR.readLine()) != null){
            String[] parts = linha.split("\t");
            String nome = parts[0];
            String perfil = parts[1];
            String curso = parts[2];
            Aluno aluno = new Aluno(curso, nome, perfil);
            DEI.add(aluno);
        }
    }
    
    /** Método para carregar os docentes inseridos no ficheiro .txt para o programa
     * @param fich nome do ficheiro dos docentes
     * @throws java.io.IOException
     */
    public void loadDocentes(String fich) throws IOException{
        fR = new BufferedReader(new FileReader(fich));
        String linha;
        while((linha=fR.readLine()) != null){
            String[] parts = linha.split("\t");
            String nome = parts[0];
            String perfil = parts[1];
            String tipo = parts[2];
            Docente docente = new Docente(tipo, nome, perfil);
            DEI.add(docente);
        }
    }
    
    /** Método para carregar os funcionarios inseridos no ficheiro .txt para o programa
     * @param fich nome do ficheiro dos funcionarios
     * @throws java.io.IOException
     */
    public void loadFuncionarios(String fich) throws IOException{
        fR = new BufferedReader(new FileReader(fich));
        String linha;
        while((linha=fR.readLine()) != null){
            String[] parts = linha.split("\t");
            String nome = parts[0];
            String perfil = parts[1];
            String tipo = parts[2];
            Funcionario funcionario = new Funcionario(tipo, nome, perfil);
            DEI.add(funcionario);
        }
    }
    
    /** Método para retornar o ArraryList de pessoas pertecentes à comunidade
     * @return ArrayList - DEI
     */
    public ArrayList getDEI(){
        return DEI;
    }
    
    /** Método para carregar os locais inseridos no ficheiro .txt para o programa
     * @param fich nome do ficheiro dos locais
     * @throws java.io.IOException
     */
    public void loadLocais(String fich) throws IOException{
        fR = new BufferedReader(new FileReader(fich));
        String linha;
        while((linha=fR.readLine()) != null){
            String[] parts = linha.split("\t");
            String tipo = parts[0];
            String nome = parts[1];
            float altitude = parseFloat(parts[2]);
            float latitude = parseFloat(parts[3]);
            int lotacao_area = Integer.parseInt(parts[4]);
            float preco_cons_min = parseFloat(parts[5]);
            switch (tipo) {
                case "Bar":
                    Bar bar = new Bar(lotacao_area, preco_cons_min, nome, altitude, latitude);
                    locais_conv.add(bar);
                    break;
                case "Exposicao":
                    String tipo_expo = parts[6];
                    Exposicao exposicao = new Exposicao(tipo_expo, preco_cons_min, nome, altitude, latitude);
                    locais_conv.add(exposicao);
                    break;
                case "Jardim":
                    Jardim jardim = new Jardim(lotacao_area, nome, altitude, latitude);
                    locais_conv.add(jardim);
                    break;
                case "AreaDesportiva":
                    ArrayList<String> desportos = new ArrayList<>();
                    String[] desporto = parts[6].split(", ");
                    for(int i=0; i<desporto.length; i++){
                        desportos.add(desporto[i]);
                    }
                    AreaDesportiva area_desportiva = new AreaDesportiva(desportos, nome, altitude, latitude);
                    locais_conv.add(area_desportiva);
                    break;
                default:
                    System.out.println("Erro ao ler ficheiro de locais");
                    break;
            }
        }
    }
    
    /** Método para obter o ArrayList dos locais disponíveis para o convivio
     * @return ArrayList - locais_conv
     */
    public ArrayList getLocais(){
        return locais_conv;
    }
}