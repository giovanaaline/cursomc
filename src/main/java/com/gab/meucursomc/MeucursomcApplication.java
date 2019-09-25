package com.gab.meucursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gab.meucursomc.domain.Categoria;
import com.gab.meucursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class MeucursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(MeucursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
