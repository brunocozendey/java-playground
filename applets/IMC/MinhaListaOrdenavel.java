import java.util.*;

public class MinhaListaOrdenavel{
    ArrayList<PessoaIMC> Lista = new ArrayList<PessoaIMC>();

    public void add(PessoaIMC p){
        Lista.add(p);
    }

    public PessoaIMC PessoaIMCget(int i){
        return Lista.get(i);
    }

    public int ListaSize(){
        return Lista.size();
    }

    public String Print(){
        return Arrays.toString(Lista.toArray());
    }

    public void reverseList(ArrayList<PessoaIMC> Lista){
        ArrayList<PessoaIMC> aux = new ArrayList<PessoaIMC>(); 
        aux.addAll(Lista);
        Lista.clear();
        for(int i=(aux.size()-1); i>=0; i--){
            Lista.add(aux.get(i));
        }
    }
    
    public Comparator <PessoaIMC> pesoC = new Comparator() {
        @Override
        public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
            double pf1, pf2;
            pf2 = ((PessoaIMC) p2).getPeso();
            pf1 = ((PessoaIMC) p1).getPeso();
            //return (int) Math.round (pf2 – pf1);
            return (int) (Math.round(pf2 - pf1));
        }
    };

    public Comparator <PessoaIMC> nomeC = new Comparator() {
        @Override
        public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
            String pf1, pf2;
            pf2 = ((PessoaIMC) p2).getNome();
            pf1 = ((PessoaIMC) p1).getNome();
            return pf1.compareTo(pf2);
        }

    };

    public Comparator <PessoaIMC> alturaC = new Comparator() {
        @Override
        public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
            double pf1, pf2;
            pf2 = ((PessoaIMC) p2).getAltura();
            pf1 = ((PessoaIMC) p1).getAltura();
            return (int) (Math.round(100*(pf2 - pf1))); //Multipliquei para transformar em cm.
        }
    };

    public Comparator <PessoaIMC> imcC = new Comparator() {
        @Override
        public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
            double pf1, pf2;
            pf2 = Math.round(((PessoaIMC) p2).calculaIMC(((PessoaIMC) p2).getAltura(),((PessoaIMC) p2).getPeso()));
            pf1 = Math.round(((PessoaIMC) p1).calculaIMC(((PessoaIMC) p1).getAltura(),((PessoaIMC) p1).getPeso()));
            return (int) (Math.round(pf2 - pf1));
        }
    };

    public void Ordena(int opcao){
        switch(opcao){
            case 1:
                Collections.sort(Lista,nomeC);  
                break;
            case 2:
                Collections.sort(Lista,nomeC);
                reverseList(Lista);
                break;
            case 3:
                Collections.sort(Lista,pesoC.reversed());
                break;
            case 4:
                Collections.sort(Lista,alturaC);
                break;
            case 5:
                Collections.sort(Lista,imcC.reversed());
                break;    
        }
        
        /*Collections.sort(Lista , new Comparator<PessoaIMC>(){
            public int compare(Object p1, Object p2){
                double pf1, pf2;
                pf2 = ((PessoaIMC) p2).getPeso();
                pf1 = ((PessoaIMC) p1).getPeso();
                return (int) (Math.round(pf2 - pf1));  
            }});*/
    }


}