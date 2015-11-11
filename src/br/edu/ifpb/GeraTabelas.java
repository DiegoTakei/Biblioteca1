package br.edu.ifpb;

import javax.persistence.*;

public class GeraTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.
		          createEntityManagerFactory("tarefas");

		    factory.close();

	}

}
