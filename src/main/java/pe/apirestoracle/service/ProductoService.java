package pe.apirestoracle.service;

import java.util.Map;

import pe.apirestoracle.entity.Producto;

public interface ProductoService {
	int create(Producto p);
	int update(Producto p);
	int update(int id);
	int delete(int id);
	Map<String, Object> readAll();
}
