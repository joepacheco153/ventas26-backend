package pe.apirestoracle.dao;

import java.util.List;
import java.util.Map;

import pe.apirestoracle.entity.Producto;




public interface ProductoDao {
	int create(Producto p);
	int update(Producto p);
	int update(int id);
	int delete(int id);
	Map<String, Object> readAll();
}
