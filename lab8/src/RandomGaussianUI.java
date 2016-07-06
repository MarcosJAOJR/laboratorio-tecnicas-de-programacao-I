import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class RandomGaussianUI {
  private JFrame janela;
  private JPanel painelPrincipal;
  private JTable tabela;

  public static void main(String[] args) {
    new RandomGaussianUI().montaTela();
  }

  private void montaTela() {
    preparaJanela();
    preparaPainelPrincipal();
    preparaTabela();
    preparaBotaoGerarNumeros();
    preparaBotaoSair();
    mostraJanela();
  }

  private void preparaJanela() {
    janela = new JFrame("Random Gaussian");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void preparaPainelPrincipal() {
    painelPrincipal = new JPanel();
    janela.add(painelPrincipal);
  }

  private void preparaTabela() {
    tabela = new JTable();

    JScrollPane scroll = new JScrollPane();
    scroll.getViewport().add(tabela);

    painelPrincipal.add(scroll);
  }

  private void preparaBotaoGerarNumeros() {
    JButton botaoGerarNumeros = new JButton("Gerar Amostras");
    botaoGerarNumeros.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        List<String> lista = Sort.getList();
        RandomGaussianTableModel tblModel = new RandomGaussianTableModel(lista);
        tabela.setModel(tblModel);
      }
    });
    painelPrincipal.add(botaoGerarNumeros);
  }

  private void preparaBotaoSair() {
    JButton botaoSair = new JButton("Sair");
    botaoSair.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    painelPrincipal.add(botaoSair);
  }

  private void mostraJanela() {
    janela.pack();
    janela.setSize(540, 540);
    janela.setVisible(true);
  }

  public class RandomGaussianTableModel extends AbstractTableModel {

    private final List<String> lista;

    RandomGaussianTableModel(List<String> pLista) {
      this.lista = pLista;
    }

    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 1;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
      return lista.get(linha);
    }

    @Override
    public String getColumnName(int column) {
      return "Amostras";
    }
  }
}
