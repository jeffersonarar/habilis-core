package br.com.core;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.Enum.Periodo;
import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Model.Matriz;

public class TesteMatriz {

	
	public void testeMatriz(){
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"META-INF/spring.xml");
		IGenericDao matrizDao = ctx.getBean("igenericDao", IGenericDao.class);
		Matriz matriz = new Matriz();
		Matriz m[] = new Matriz[5];
		m[0] = new Matriz("Matriz 2007",12, true);
		m[1] = new Matriz("Matriz 2009",12, true);
		m[2] = new Matriz("Matriz 2011",12, true);
		m[3] = new Matriz("Matriz 2013",12, true);
		m[4] = new Matriz("Matriz 2015",12, true);

		for (int i = 0; i < 5; i++) {
			matrizDao.save(m[i]);
		}

		List<IModel<?>> matrizes = matrizDao.findAll(matriz);
		for (IModel<?> ma : matrizes) {
			System.out
					.println("---------------------------------------------------");
			System.out.println(ma.toString());

		}

	}
}
