package br.com.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.DAO.EmpresaDAO;
import br.com.core.DAO.GenericDAO;
import br.com.core.Enum.Periodo;
import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Model.Empresa;
import br.com.core.Model.Estagiario;
import br.com.core.Model.Matriz;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	   EmpresaDAO empresaDao = new EmpresaDAO();
		
		Empresa empresa = new Empresa();
		Empresa e[] = new Empresa[5];
		e[0] = new Empresa("hdjxxxhxnx", "empresa 1",771111777,"empresa1@teste.com", "0627617-1616", true);
		e[1] = new Empresa("hdjdxxhxnx", "empresa 2",771111722,"empresa2@teste.com", "0627617-1616", true);
		e[2] = new Empresa("hdjdxxhxnx", "empresa 3",771111722,"empresa3@teste.com", "0627617-1616", true);
		e[3] = new Empresa("hdjdhxxnx", "empresa 4",771111722,"empresa4@teste.com", "0627617-1616", true);
		e[4] = new Empresa("hdjdhdxxnx", "empresa 5",771111722,"empresa5@teste.com", "0627617-1616", true);

		for (int i = 0; i < 5; i++) {
			empresaDao.save(e[i]);
		}

		List<IModel<?>> empresas = empresaDao.findAll(empresa);
		for (IModel<?> emp : empresas) {
			System.out
					.println("---------------------------------------------------");
			System.out.println(emp.toString());

		}

	}


}
