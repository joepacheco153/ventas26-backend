package pe.apirestoracle.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.entity.Producto;
import pe.apirestoracle.service.ProductoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping("/productos")
public class ProductoController {
@Autowired
private ProductoService prodService;

@GetMapping("/all")
public Map<String, Object> readAll(){
	return prodService.readAll();
}
@PostMapping("/add")
public int create (@RequestBody Producto p) {
	System.out.println("CREANDO:  "+p.getNomprod()+p.getPrecio()+p.getStock());
	return prodService.create(p);
}

}
