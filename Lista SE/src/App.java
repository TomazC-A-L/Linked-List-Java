public class App {
    public static void main(String[] args) throws Exception {
      
        Lista sec = new Lista();
        Celula c1 = new Celula(1);
        Celula c2 = new Celula(3);
        Celula c3 = new Celula(5);
        Celula c4 = new Celula(7);
        Celula c5 = new Celula(10);
        Celula c6 = new Celula(11);



        sec.InserirNoFinal(c1);
        sec.InserirNoFinal(c2);
        sec.InserirNoFinal(c3);
        sec.InserirNoFinal(c4);
        sec.InserirNoFinal(c5);
        sec.InserirNoFinal(c6);


        System.out.println("-----------------------------");
        sec.removerImpar();
        sec.imprimir();
    }
}
