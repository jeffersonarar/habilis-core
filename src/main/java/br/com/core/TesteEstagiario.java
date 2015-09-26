package br.com.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.DAO.EstagiarioDAO;
import br.com.core.Enum.Periodo;
import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Model.Estagiario;
import br.com.core.Model.Matriz;

public class TesteEstagiario {
	
	
	public static void main(String[] args) {

		EstagiarioDAO estagiarioDao = new EstagiarioDAO();
		
		Estagiario estagiario = new Estagiario();
		Estagiario e[] = new Estagiario[5];
		e[0] = new Estagiario("NOME 0", "nome0@teste.com", "0627617-1616", 314457910, 1111111331, true, "tgtgw" ,true,  new Matriz("2009", 1, true), 3);
		e[1] = new Estagiario("NOME 1", "nome1@teste.com", "0627617-1616", 514457910, 1111111331, true, "rfrfr" ,true , new Matriz("2029", 2, true), 3);
		e[2] = new Estagiario("NOME 2", "nome2@teste.com", "0627617-1616", 1234567910, 1111133111, true, "frfrfr" ,true, new Matriz("2029", 2, true), 3);
		e[3] = new Estagiario("NOME 3", "nome3@teste.com", "0627617-1616", 234567910, 111131111, true, "rfr4f4r" ,true, new Matriz("2012", 2, true), 2);
		e[4] = new Estagiario("NOME 4", "nome4@teste.com", "0627617-1616", 123567910, 11211111, true, "frft43t" ,true, new Matriz("2012", 2, true), 1);

		for (int i = 0; i < 5; i++) {
			estagiarioDao.save(e[i]);
		}

		List<IModel<?>> estagiarios = estagiarioDao.findAll(estagiario);
		for (IModel<?> est : estagiarios) {
			System.out
					.println("---------------------------------------------------");
			System.out.println(est.toString());

		}
	       Map<Integer,String> mapa = new HashMap<Integer,String>();  
	          
	          
	        mapa.put(1,"matriz_id");  

		
		estagiarioDao.findIdForeigh(new Estagiario(), new Matriz("2012", 2, true));

	}

}
