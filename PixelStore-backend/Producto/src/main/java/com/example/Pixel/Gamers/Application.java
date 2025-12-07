package com.example.Pixel.Gamers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Pixel.Gamers.Model.Producto;
import com.example.Pixel.Gamers.Repository.ProductoRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ProductoRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		if (productoRepository.count() == 0) {
			productoRepository.save(new Producto(null, "Razer FireFly v2", "Alfombrilla RGB para mouse", 29990.0, 10, "https://i.postimg.cc/6Qzdy4Qr/razer-firefly-v2-hero-mobile.webp", false, null));
			productoRepository.save(new Producto(null, "Razer Cobra Pro", "Mouse gamer inalámbrico", 119990.0, 15, "https://i.postimg.cc/htWw0611/Razer-Cobra-Pro.webp", false, null));
			productoRepository.save(new Producto(null, "Teclado RedDragon Kumara K552", "Teclado mecánico compacto", 39990.0, 20, "https://i.postimg.cc/bJ7MF5jG/kumara-rgb-1.jpg", false, null));
			productoRepository.save(new Producto(null, "Monitor Samsung Odyssey G3", "Monitor gaming 24''", 89990.0, 8, "https://i.postimg.cc/4NTq6j5v/Monitor-odyssey.avif", false, null));
		}
	}
}
