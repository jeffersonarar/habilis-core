package br.com.core.DAO;

import org.springframework.security.crypto.bcrypt.BCrypt;

import br.com.core.Interface.IModel;
import br.com.core.Model.Estagiario;
import br.com.core.Util.Retorno;

public class EstagiarioDAO extends MsrDAO{
	
	private Estagiario estagiario;
	
    public Retorno save(IModel<?> entidade) {
    	setEstagiario((Estagiario) entidade);
    	String senha = BCrypt.hashpw(estagiario.getSenha(), BCrypt.gensalt());
    	estagiario.setSenha(senha);
        return super.save(entidade);
    }

	public Estagiario getEstagiario() {
		return estagiario;
	}

	public void setEstagiario(Estagiario estagiario) {
		this.estagiario = estagiario;
	}

}
