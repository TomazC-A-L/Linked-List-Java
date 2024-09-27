public class App {
    public static void main(String[] args) throws Exception {
        
        ListaDE de = new ListaDE();
        Celula c1 = new Celula(1);
        Celula c2 = new Celula(2);
        Celula c3 = new Celula(3);
        Celula c4 = new Celula(4);
        Celula c5 = new Celula(5);


        de.inserirNoFinal(c1);
        de.inserirNoFinal(c2);
        de.inserirNoFinal(c3);
        de.inserirNoFinal(c4);
        de.inserirNoInicio(c5);
        de.pesquisar(2);
        de.removerNoFinal();
        de.removerNoInicio();
        
        
        de.imprimir();

        
    }
}
