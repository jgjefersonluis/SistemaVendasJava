import org.hibernate.Session;

import com.kurtphpr.sistema.vendas.HibernateUtil;

public class Conecta {
	
	public static void main(String [] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectado ao sistema!");
		}finally {
			sessao.close();
			System.out.println("O sistema encerrou a conexão!");
		}
	}

}
