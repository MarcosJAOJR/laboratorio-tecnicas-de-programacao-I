import java.util.*;

public class Brasil {

  public static void main(String[] args) {
    HashMap<String,String> estados = new HashMap<String,String>();
    estados.put("AC","Acre");
	  estados.put("AL","Alagoas");
	  estados.put("AM","Amazonas");
	  estados.put("AP","Amapá");
	  estados.put("BA","Bahia");
	  estados.put("CE","Ceará");
	  estados.put("DF","Distrito Federal");
	  estados.put("ES","Espirito Santo");
	  estados.put("GO","Goias");
	  estados.put("MA","Maranhão");
	  estados.put("MG","Minas Gerais");
	  estados.put("MS","Mato Grosso Sul");
	  estados.put("MT","Mato Grosso");
	  estados.put("PA","Pará");
	  estados.put("PB","Paraiba");
	  estados.put("PE","Pernanbuco");
	  estados.put("PI","Piaui");
	  estados.put("PR","Parana");
	  estados.put("RJ","Rio de Janeiro");
	  estados.put("RN","Rio Grande do Norte");
	  estados.put("RO","Rondônia");
	  estados.put("RR","Roraima");
	  estados.put("RS","Rio Grande do Sul");
	  estados.put("SC","Santa Catarina");
	  estados.put("SE","Sergipe");
	  estados.put("SP","São Paulo");
	  estados.put("TO","Tocantins");

    if (args.length > 0) {
      String uf = args[0].toUpperCase();
      if (estados.get(uf) == null)
        System.out.println("Estado inválido");
      else
        System.out.println(uf+" -> "+estados.get(uf));
    }
  }
}
