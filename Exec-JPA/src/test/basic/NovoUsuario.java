package test.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basic.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exec-JPA");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario1 = new Usuario("Jean", "Jean@hotmail.com");

		em.getTransaction().begin();
		em.persist(usuario1);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
