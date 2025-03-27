package aula05.Televisao;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

	
	
	public void adiciona(Televisao t) {
		try {
			valida(t);
			list.add(t);
		} catch (Exception e) {	
			e.printStackTrace();			
		}
	}
	
	public Televisao buscaTelevisao(String nome) {
		Televisao ret = null;
		for(Televisao t : list) {
		if(t.no.equals(nome)) {
		ret = t;
		}
		}
		return ret;
		
		
		
	}
	
	List<Televisao> list = new ArrayList<>();
	private void valida(Televisao t) throws Exception {
		if(t == null) {
			throw new Exception("Objecto Tv esta null");
		}
		if(t.no.equals("") || (t.tamanho < 0 || t.tamanho > 100)) {
			throw new Exception("dados da tv estao incorretos");
		}
	}
	
	// funcao nao usada
//	public void adicionar(Televisao t) {
//		
//	}
	
}
