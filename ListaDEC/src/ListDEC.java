public class ListDEC {
    Celula cabeca;

    public ListDEC() {
        this.cabeca = new Celula(-1);
    }
    
    boolean vazia(){
        return cabeca.prox == null;
    }
    public void inserirNoFinal(Celula c){
        if (vazia()) {
            cabeca.prox = c;
            cabeca.ant = c;
        }else{
            Celula aux = cabeca;
            while (aux != cabeca) {
                aux = aux.prox;
                
            }
            c.prox = cabeca;
            c.ant = aux;
            aux.prox = c;
            cabeca.ant = c;
        }

    }

    public void inserirNoInicio(Celula c){
        if (vazia()) {
            cabeca.prox = c;
            cabeca.ant = c;
            
        }

    }



    public void imprimir(){
        Celula aux = cabeca;
        while (aux != cabeca && aux != null) {
            System.out.println(aux.valor);
            aux = aux.prox;
            
        }
    }
}
