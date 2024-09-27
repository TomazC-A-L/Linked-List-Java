public class ListaDE {

    Celula primCelula;
    public ListaDE(){
        this.primCelula = null;

    }

    public boolean vazia(){
        if(primCelula == null){
            return true;
        }else{
            return false;
        }

    }

    public void inserirNoFinal(Celula c){

        if (vazia()) {
            primCelula = c;
            
        }else{
            Celula aux = primCelula;
            if(primCelula.prox != null){
              
                while (aux.prox != null) {
                    aux = aux.prox;    
                }
                c.ant = aux;
                aux.prox = c;

            }else{
                primCelula.prox = c;
            }
        }
        
    }

    public void removerNoFinal(){

        if (vazia()){
            System.out.println("TA VAZIAAA");
        }else{
            if (primCelula.prox != null ) {
                Celula aux = primCelula;
                
                while (aux.prox.prox != null){
                    aux = aux.prox;                   
                }
                aux.prox = null;
            }else{
                primCelula = null;
            }
        }


    }

    public void inserirNoInicio(Celula c){
        if (!vazia()) {
            c.prox = primCelula;
            primCelula.ant = c;
        }
        primCelula = c;

    }

    public boolean removerNoInicio(){ // pq e boolean?
        if (vazia()) {
            return false;       
        }else{
            Celula aux = primCelula;

            if(aux.prox == null){
                primCelula = null;
            }else{
                primCelula = aux.prox;
                aux.prox = null;
            }
            return true;
        }


    }

    public void pesquisar(int valor){
        if (vazia()) {
            System.out.println("Lista Vazia");;
            
        }else{
            Celula aux = primCelula;
            while (aux != null && aux.valor != valor) {
              aux = aux.prox;  
            }
            System.out.println("Valor encontrado " + aux.valor);    
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
