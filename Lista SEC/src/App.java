public class App {
    public static void main(String[] args) throws Exception {

        ListaSEC sec = new ListaSEC();
        Celula c0 = new Celula(0);
        Celula c1 = new Celula(1);
        Celula c2 = new Celula(2);
        Celula c3 = new Celula(3);
        //Celula c4 = new Celula(4);
        Celula c5 = new Celula(5);

        sec.InserirNoFinal(c0);
        sec.InserirNoFinal(c1);
        sec.InserirNoFinal(c2);
        sec.inserirNoInicio(c3);
        sec.InserirNoFinal(c5);
        sec.removerInicio();
        sec.removerNoFinal();

        sec.imprimir();

    }
}
