import java.util.*;
import java.io.*;

class HashtableTest implements Serializable
{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Livro2> livros = new ArrayList<Livro2>(); // or use map.keys()
        List<String> list = new ArrayList<String>(); // or use map.keys()
        String key;
        Enumeration<String> nomes;
        String out="";

        Hashtable<String, Livro2> cadastroLivro = new Hashtable<String, Livro2>();
        Hashtable<String, Livro2> cadastroLivroCopia = new Hashtable<String, Livro2>();        
        Livro2 l1 = new Livro2("A");
        Livro2 l2 = new Livro2("B");
        Livro2 l3 = new Livro2("C");
        Livro2 l4 = new Livro2("D");
        Livro2 l5 = new Livro2("E");

        cadastroLivro.put("A",l1);
        cadastroLivro.put("B",l2);
        cadastroLivro.put("C",l3);
        cadastroLivro.put("D",l4);
        cadastroLivro.put("E",l5);

        nomes = cadastroLivro.keys();
        
        /*ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("livros.dat"));

        outStream.writeObject(cadastroLivro);

        outStream.close();
*/

        salvarArq(cadastroLivro);

        /*
        ObjectInputStream inputStream =
        new ObjectInputStream(new FileInputStream("livros.dat"));
        */
    
        Livro2 l6 = new Livro2("AA");
        Livro2 l7 = new Livro2("BB");

        cadastroLivro.put("A2",l6);
        cadastroLivro.put("B2",l7);

        salvarArq(cadastroLivro);

        cadastroLivroCopia = abrirArq();
        /*cadastroLivroCopia = (Hashtable<String, Livro2>) inputStream.readObject();
        inputStream.close();*/
        
        nomes = cadastroLivroCopia.keys();
        while(nomes.hasMoreElements()) {
            key = nomes.nextElement();
            System.out.println(key);
            System.out.println((cadastroLivroCopia.get(key)).getTit());
        }
      
        
        
        /*while(nomes.hasMoreElements()) {
            key = (String) nomes.nextElement();
            livros.add(cadastroLivro.get(key));
        }
        for (int i=0;i < (livros.size());i++){

            list.add((livros.get(i)).getTit());
        }

        Collections.sort(list);
        for (int j=0;j < (list.size());j++){
            out += list.get(j)+"\n";
        }
        
        System.out.println(out);
        */ 
    }

    public static void salvarArq(Hashtable cadastroLivro) throws IOException, ClassNotFoundException{
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("livros.dat"));
        outStream.writeObject(cadastroLivro);
        outStream.close();
    }

    public static Hashtable abrirArq() throws IOException, ClassNotFoundException{
        Hashtable<String, Livro2> cadastroLivro = new Hashtable<String, Livro2>();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("livros.dat"));
        cadastroLivro = (Hashtable<String, Livro2>) inputStream.readObject();
        inputStream.close();
        return cadastroLivro;
    }
}
