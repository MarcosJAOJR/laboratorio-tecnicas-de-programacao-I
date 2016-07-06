import java.util.*;
import java.io.*;

public class Sort {

  private static TreeSet<Double> list = new TreeSet<Double>();
  private static File f = new File("arquivo.txt");

  public static void main(String... aArgs) {

    try {
      // Gerando arquivo não ordenado
      RandomGaussian.main();
      System.out.println("> Arquivo não ordenado gerado por RandomGaussian...");
      readFile();
      writeFile();
      System.out.println("> Arquivo com números ordenados regravado com sucesso!");
    }
    catch (Exception e) {
      System.out.println(e);
    }

  }

  public static void readFile() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

    String linha = br.readLine();
    while(linha != null){
      list.add(Double.parseDouble(linha));
      linha = br.readLine();
    }
  }

  public static void writeFile() throws Exception {
    // Gravando lista ordenada no arquivo
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
    for (Double item : list) {
      bw.write(String.valueOf(item+"\n"));
    }
    bw.close();
  }

  public static List<String> getList() {
    try {
      readFile();
    }
    catch(Exception e) {
      System.out.println(e);
    }

    List<String> result = new LinkedList<String>();
    for (Double item : list) {
      result.add(String.valueOf(item));
    }
    return result;
  }

}
