
public class Lista {

    Celula primCelula;
    
    public Lista(){
        this.primCelula = null;

    }

    public Boolean vazia(){
        if (primCelula == null){
            return true;
        }else{
            return false;

        }

    }

    public  void InserirNoFinal(Celula c1){
        if(vazia()){
            primCelula = c1;

        }else{
            Celula aux = primCelula;
            while (aux.prox != null) {
                aux = aux.prox;
                
            }
            aux.prox = c1;
            
        }
    }
    public void inserirNoInicio(Celula c3){
        c3.prox = primCelula;
        primCelula = c3;

    }
    
    public Celula pesquisar(int v){
        Celula aux = primCelula;
        while (aux != null) {
            if(aux.valor == v){
                System.out.println("valor encontrado");
                return aux;
            }
            aux = aux.prox;
        }
        System.out.println("valor nao encontrado");
        return null;

    } 
    public boolean removerNoinicio(){
        if(vazia()){
            System.out.println("Lista vazia");
            return false;

        }else{
            Celula remove = primCelula;

            if(remove.prox == null){
                primCelula = null;

            }else{
                primCelula = remove.prox;
                remove = null; 
                
            }
            return true;

        }
    }
    public void removerImpar() {
        while (primCelula != null && (primCelula.valor % 2) != 0){
            primCelula = primCelula.prox;
        }
        if(vazia()){
            System.out.println("vazia");
        } else {
            Celula aux = primCelula;
            Celula ante = null;
            while(aux != null){
                if(aux.valor % 2 != 0) {
                    ante.prox = aux.prox;
                } else {
                    ante = aux;
                }
                aux = aux.prox;
            }
        }
    }

    public boolean removerNoFinal(){
        if(vazia()){
            System.out.println("Lista vazia");
            return false;

        }else{
            Celula ant = primCelula;
            Celula atual = primCelula.prox;
            if(atual != null){
                while (atual.prox != null) {
                    ant = atual; 
                    atual = atual.prox;
                }
                ant.prox = null;
                return true;
                
            }else{
                atual = primCelula;
                primCelula = null;   
                return true;
            }
        }
    }

    public void RemoveIndex(int numremove){

        if(vazia()){
            System.out.println("lista vazia");

        }else{
            Celula aux = primCelula;
            Celula atual = primCelula.prox;

            if(atual == null){

                primCelula = null;

            }else{

                while (atual != null) {
                    if(atual.valor == numremove){
                    aux.prox = atual.prox;
                    atual.prox = null;
                    }
                    aux = atual;
                    atual = atual.prox;
                } 
            }
        
        }
    }
    

    public void imprimir(){
        Celula aux = primCelula;
        while (aux != null){
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }

}
