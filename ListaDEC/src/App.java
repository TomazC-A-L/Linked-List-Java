public class App {
    public static void main(String[] args) throws Exception {
        ListDEC dec = new ListDEC();
        Celula c = new Celula(0);

        Celula c1 = new Celula(1);
        Celula c2 = new Celula(2);
        Celula c3 = new Celula(3);
        Celula c4 = new Celula(4);
        Celula c5 = new Celula(5);
        Celula c6 = new Celula(6);


        dec.inserirNoFinal(c1);
        dec.inserirNoFinal(c2);
        dec.inserirNoFinal(c3);
        dec.inserirNoFinal(c4);
        dec.inserirNoFinal(c5);
        dec.imprimir();
    }
}
