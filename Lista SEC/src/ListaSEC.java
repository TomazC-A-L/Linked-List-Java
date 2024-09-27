
public class ListaSEC {

    Celula cabeca;

    public ListaSEC(){
        cabeca = new Celula(-1);
        cabeca.prox = cabeca;

    }

    public Boolean vazia(){
        return (cabeca.prox == cabeca);

    }

    public void InserirNoFinal(Celula c){
        if (vazia()) {
            cabeca.prox = c;
            c.prox = cabeca; 
        }else{

            Celula aux = cabeca.prox;
            while (aux.prox != cabeca) {
                aux = aux.prox; 
            }
            aux.prox = c;
            c.prox = cabeca;
        }
    }

    public void inserirNoInicio(Celula c){ //duvida na orientacao das celulas cabeca 
        Celula aux =  cabeca.prox;
        cabeca.prox = c ;
        c.prox = aux;

    }


    public Celula pesquisar(int valor){
        if (vazia()) {
            return null;
            
        }else{
            Celula aux = cabeca.prox;
            while(aux != cabeca && aux.valor !=valor){
                aux =aux.prox;

            }
            if(aux == cabeca){
                return null;

            }
            return aux;

        }
    }
    boolean removerInicio(){
        if(vazia()){ 
            return false; 
        
        }else{
            Celula aux = cabeca.prox;
            cabeca.prox = aux.prox;
            aux.prox = null;
            return true;
        }
    }

    boolean removerNoFinal(){
        if(vazia()){
            return false;


        }else{
            Celula aux = cabeca;
            while (aux.prox.prox != cabeca) {
               aux = aux.prox; 
            }
            aux.prox = cabeca;
            return true;
        }

    }

    public void imprimir(){
        Celula aux = cabeca.prox;
        while (aux != cabeca) {
            System.out.println("valor = " + aux.valor);
            aux = aux.prox;
            
        } 
    }      

}
