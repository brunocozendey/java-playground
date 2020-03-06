import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.GregorianCalendar;
import java.text.*;
import javax.swing.table.*;

public class IMCWindow extends JApplet implements ActionListener {

   JButton botaoAdd;
   JPanel grupoBotaoAdd;
   JComboBox botaoDeSelecao;
   String[] botaoDeSelecaoString={"[A-Z]","[Z-A]","Peso","Altura","IMC"};
   JRadioButton masculino, feminino;
   ButtonGroup grupoSexo;
   JPanel grupoSexoPanel;
   JLabel titulo,titulo2,titulo3,titulo4,ordemLista;
   JTextField campoDeTexto,campoDeTexto2,campoDeTexto3,campoDeTexto4;
   JTextArea areaDeTexto;
   JPanel grupoTexto, grupoTexto2, grupoTexto3, grupoTexto4;
   Panel p;
   Container cp;
   MinhaListaOrdenavel MyList = new MinhaListaOrdenavel();


   String[] columnNames = {"Nome","Data de Nascimento","Altura","Peso","IMC"};
   DefaultTableModel dtm = new DefaultTableModel(0, 0);
   /*Object[][] data = {
        {"Kathy", "Smith",
         "Snowboarding", new Integer(5), new Boolean(false)},
        {"John", "Doe",
         "Rowing", new Integer(3), new Boolean(true)},
        {"Sue", "Black",
         "Knitting", new Integer(2), new Boolean(false)},
        {"Jane", "White",
         "Speed reading", new Integer(20), new Boolean(true)},
        {"Joe", "Brown",
         "Pool", new Integer(10), new Boolean(false)}
        };*/
   Object[][] data;


public void init() {
      //botoes
      botaoAdd = new JButton("Add");
      botaoAdd.addActionListener(this);
      grupoBotaoAdd = new JPanel();
      grupoBotaoAdd.add(botaoAdd);
      
      
      //botao de selecao
      botaoDeSelecao = new JComboBox(botaoDeSelecaoString);
      botaoDeSelecao.addActionListener(this);
     
      //botao de opcao
      grupoSexo = new ButtonGroup();
      grupoSexoPanel = new JPanel();
      
      masculino = new JRadioButton("Masculino");
      feminino = new JRadioButton("Feminino");
      
      grupoSexo.add(masculino);
      grupoSexo.add(feminino);
      
      masculino.addActionListener(this);
      feminino.addActionListener(this);
      
      grupoSexoPanel.add(masculino);
      grupoSexoPanel.add(feminino);
      
      //Cria um painel agrupando um Label e um Campo de Texto
      titulo = new JLabel("Nome: ");
      campoDeTexto = new JTextField(20);
      
      titulo2 = new JLabel("Data Nascimento: ");
      campoDeTexto2 = new JTextField(6);
      
      titulo3 = new JLabel("Peso: ");
      campoDeTexto3 = new JTextField(4);
      titulo4 = new JLabel("Altura: ");
      campoDeTexto4 = new JTextField(4);

      grupoTexto = new JPanel();
      campoDeTexto.addActionListener(this);
      grupoTexto.add(titulo);
      grupoTexto.add(campoDeTexto);
     
      grupoTexto2 = new JPanel();
      campoDeTexto2.addActionListener(this);
      grupoTexto2.add(titulo2);
      grupoTexto2.add(campoDeTexto2);
      
      grupoTexto3 = new JPanel();
      campoDeTexto3.addActionListener(this);
      grupoTexto3.add(titulo3);
      grupoTexto3.add(campoDeTexto3);
      
      grupoTexto4 = new JPanel();
      campoDeTexto4.addActionListener(this);
      grupoTexto4.add(titulo4);
      grupoTexto4.add(campoDeTexto4);

      ordemLista = new JLabel("Ordenar Lista: ");

      //Content Pane
      cp = getContentPane();
      GridLayout gridLayout2 = new GridLayout(3,2,5,5);
      cp.setLayout(gridLayout2);
      p = new Panel ();
      areaDeTexto = new JTextArea();
      areaDeTexto.setEditable(false);
      JScrollPane scrollPane = new JScrollPane(areaDeTexto, 
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scrollPane.setPreferredSize(new Dimension(300, 280));
      
      p.add(grupoTexto);      
      p.add(grupoTexto2);
      p.add(grupoTexto3);
      p.add(grupoTexto4);
      
      p.add(grupoSexoPanel);
      
      p.add(grupoBotaoAdd);
      
      p.add(ordemLista);
      p.add(botaoDeSelecao);
      p.add(scrollPane);
      cp.add(p);

      //Copiado do Ex1
      
      
      Homem h1 = new Homem();
      Homem h2 = new Homem();
      Homem h3 = new Homem();
      Homem h4 = new Homem();
      Homem h5 = new Homem();
      
      Mulher m1 = new Mulher();      
      Mulher m2 = new Mulher();
      Mulher m3 = new Mulher();
      Mulher m4 = new Mulher();
      Mulher m5 = new Mulher();
    
      h1.nome = "Bruno";
      h1.dataNascimento = "30/01/1990";
      h1.peso = 80.0;
      h1.altura = 1.80;
      MyList.add(h1);

      h2.nome = "Bento";
      h2.dataNascimento = "17/05/1987";
      h2.peso = 90.0;
      h2.altura = 1.70;
      MyList.add(h2);

      h3.nome = "Salir";
      h3.dataNascimento = "12/04/1956";
      h3.peso = 60.0;
      h3.altura = 1.70;
      MyList.add(h3);

      m1.nome = "Gabriela";
      m1.dataNascimento = "21/09/1989";
      m1.peso = 48.0;
      m1.altura = 1.58;
      MyList.add(m1);

      m2.nome = "Lana";
      m2.dataNascimento = "21/09/1937";
      m2.peso = 65.0;
      m2.altura = 1.90;
      MyList.add(m2);

      m3.nome = "Maria";
      m3.dataNascimento = "12/03/1987";
      m3.peso = 50.0;
      m3.altura = 1.90;
      MyList.add(m3);
     
      h4.nome = "Ronaldo";
      h4.dataNascimento = "23/07/1980";
      h4.peso = 78.0;
      h4.altura = 2.00;
      MyList.add(h4);

      m4.nome = "Jussara";
      m4.dataNascimento = "30/05/1967";
      m4.peso = 90.0;
      m4.altura = 1.80;
      MyList.add(m4);

      h5.nome = "Javi";
      h5.dataNascimento = "23/03/1997";
      h5.peso = 90.0;
      h5.altura = 1.90;
      MyList.add(h5);
     
      m5.nome = "Ana";
      m5.dataNascimento = "23/06/1977";
      m5.peso = 50.0;
      m5.altura = 1.50;
      MyList.add(m5);
      
      for(int i=0;i<MyList.ListaSize();i++){
         areaDeTexto.append(MyList.PessoaIMCget(i).toString());
      }
         //Inserindo tabela gráfica
      //SimpleTableDemo();
      /*String [][] dados = new String[MyList.ListaSize()][5];
      for (int j=0; j<MyList.ListaSize();j++){
         for (int k =0; k<5;k++){
            switch (k) {
               case 0:
                  dados[j][k] = (MyList.PessoaIMCget(j)).getNome();
                  break;
               case 1:
                  dados[j][k] = MyList.PessoaIMCget(j).getDataNascimento();
                  break;
               case 2:
                  dados[j][k] = Double.toString(MyList.PessoaIMCget(j).getPeso());
                  break;
               case 3:
                  dados[j][k] = Double.toString(MyList.PessoaIMCget(j).getAltura());
                  break;
               case 4:
                  dados[j][k] = MyList.PessoaIMCget(j).resultIMC();
                  break;                                                      
               default:
                  break;
            }
         }
      }
       
         String [] colunas = {"Nome", "Data de Nascimento", "Peso", "Altura"}; 
*/ 


      JTable table = new JTable();
      dtm.setColumnIdentifiers(columnNames);
      table.setModel(dtm);
      
      for(int i=0;i<MyList.ListaSize();i++){
         dtm.addRow(new Object[] {MyList.PessoaIMCget(i).getNome(),MyList.PessoaIMCget(i).getDataNascimento(),Double.toString(MyList.PessoaIMCget(i).getAltura()),Double.toString(MyList.PessoaIMCget(i).getPeso()),MyList.PessoaIMCget(i).resultIMC()});
      }




      //JTable table = new JTable(data, columnNames);
      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
      table.setFillsViewportHeight(true);
      //Create the scroll pane and add the table to it.
      JScrollPane scrollPane2 = new JScrollPane(table);
      //Add the scroll pane to this panel.
      add(scrollPane2);




   } 

   
   //Este metodo responde as acoes dos componentes
   public void actionPerformed(ActionEvent e) {

      if(e.getSource() instanceof JButton) {
         //areaDeTexto.append("Um botao foi apertado \n");
         if(e.getSource()==botaoAdd) {
            if( (!"".equals(campoDeTexto.getText()))&&(!"".equals(campoDeTexto2.getText()))&&(!"".equals(campoDeTexto3.getText()))&&(!"".equals(campoDeTexto4.getText())) && ((masculino.isSelected())||(feminino.isSelected())) ) {
               //digite aqui a instrução se o campo for NÃO vazio e NÃO nulo.
               try{
                  Float.parseFloat(campoDeTexto3.getText());
                  Float.parseFloat(campoDeTexto4.getText());
                  Boolean TesteNome = (campoDeTexto.getText()).matches("[A-Z]{1}[a-z]{1,30}|([A-Z]{1}[a-z]{1,30}(\\s[A-Z]{1}[a-z]{1,30}){1,})");
                  //Boolean TesteData = (campoDeTexto2.getText()).matches("[0-3]{1}[0-9]{1}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[1-2]{1}[1-9]{1}[0-9]{1}[0-9]{1}");
                  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
                  sdf.setLenient(false); 
                  sdf.parse(campoDeTexto2.getText());
                  
                  if (TesteNome){
                     if (feminino.isSelected()){
                        Mulher fadd = new Mulher();
                        fadd.nome = campoDeTexto.getText();
                        fadd.dataNascimento = campoDeTexto2.getText();
                        fadd.peso = Float.parseFloat(campoDeTexto3.getText());
                        fadd.altura = Float.parseFloat(campoDeTexto4.getText());
                        MyList.add(fadd);
   
                     }
                     else{
                        Homem madd = new Homem();
                        madd.nome = campoDeTexto.getText();
                        madd.dataNascimento = campoDeTexto2.getText();
                        madd.peso = Float.parseFloat(campoDeTexto3.getText());
                        madd.altura = Float.parseFloat(campoDeTexto4.getText());
                        MyList.add(madd);

                     }
                     int i = MyList.ListaSize()-1; 
                     dtm.addRow(new Object[] {MyList.PessoaIMCget(i).getNome(),MyList.PessoaIMCget(i).getDataNascimento(),Double.toString(MyList.PessoaIMCget(i).getAltura()),Double.toString(MyList.PessoaIMCget(i).getPeso()),MyList.PessoaIMCget(i).resultIMC()});
                     areaDeTexto.append(campoDeTexto.getText()+"\n");
                     areaDeTexto.append(campoDeTexto2.getText()+"\n");
                     areaDeTexto.append(campoDeTexto3.getText()+"\n");
                     areaDeTexto.append(campoDeTexto4.getText()+"\n");
                     //Retirar para facilitar DEBUG
                     campoDeTexto.setText("");
                     campoDeTexto2.setText("");
                     campoDeTexto3.setText("");
                     campoDeTexto4.setText("");
                     grupoSexo.clearSelection();

                  }
                  else JOptionPane.showMessageDialog(null, "Nome inválido!");
               }
               catch(NumberFormatException ex){
                  JOptionPane.showMessageDialog(null, "ERRO: O valor de peso e altura tem que ser real!\nErro: "+ex);
               }
               catch(ParseException ex){
                  JOptionPane.showMessageDialog(null, "ERRO: Data de Nascimento Invalida. \nErro: "+ex);
               }
            }else{
               //digite aqui a intrução para quando o campo FOR vazio ou FOR nulo
               JOptionPane.showMessageDialog(null, "ERRO: Todos campos devem ser preenchidos!");
            }
               
         }
      }

      if(e.getSource() instanceof JTextField) {
         //Caso seja digitado algo no TExField
      }
      if(e.getSource() instanceof JComboBox) {
         switch ((String) botaoDeSelecao.getSelectedItem()) {
            case "[A-Z]":
               MyList.Ordena(1);
               break;
            case "[Z-A]":
               MyList.Ordena(2);      
               break;
            case "Peso": 
               MyList.Ordena(3);
               break;
            case "Altura":
               MyList.Ordena(4);
               break;
            case "IMC":
               MyList.Ordena(5);
               break;
            default:
               MyList.Ordena(1);
               break;
         }
         areaDeTexto.setText("");
         for(int i=0;i<MyList.ListaSize();i++){
            areaDeTexto.append(MyList.PessoaIMCget(i).toString());
         }

         dtm.setRowCount(0);
         for(int i=0;i<MyList.ListaSize();i++){
            dtm.addRow(new Object[] {MyList.PessoaIMCget(i).getNome(),MyList.PessoaIMCget(i).getDataNascimento(),Double.toString(MyList.PessoaIMCget(i).getAltura()),Double.toString(MyList.PessoaIMCget(i).getPeso()),MyList.PessoaIMCget(i).resultIMC()});
         }
      }
      
      if(e.getSource() instanceof JRadioButton) {
         //if(opcao1.isSelected()) {
      }
      
   }
   


   class Panel extends JPanel {
      public void paintComponent (java.awt.Graphics g) {
             super.paintComponent(g);
      } 

   }

}  
