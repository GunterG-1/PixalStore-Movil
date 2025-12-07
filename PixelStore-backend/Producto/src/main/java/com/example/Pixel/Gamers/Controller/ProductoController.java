package com.example.Pixel.Gamers.Controller;

import com.example.Pixel.Gamers.Model.Producto;
import com.example.Pixel.Gamers.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping
	public List<Producto> getAllProductos() {
		return productoService.getAllProductos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> getProductoById(@PathVariable Long id) {
		Producto producto = productoService.getProductoById(id);
		if (producto != null) {
			return ResponseEntity.ok(producto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.createProducto(producto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
		Producto updated = productoService.updateProducto(id, producto);
		if (updated != null) {
			return ResponseEntity.ok(updated);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
		boolean deleted = productoService.deleteProducto(id);
		if (deleted) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/destacados")
	public List<Producto> getProductosDestacados() {
		return productoService.getProductosDestacados();
	}
	
	@GetMapping("/buscar")
	public List<Producto> buscarProductos(@RequestParam String nombre) {
		return productoService.buscarProductosPorNombre(nombre);
	}
	
	@GetMapping("/categoria/{categoriaId}")
	public List<Producto> getProductosPorCategoria(@PathVariable Long categoriaId) {
		return productoService.getProductosPorCategoria(categoriaId);
	}
}
