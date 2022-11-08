package pe.edu.upc.trabajo_grupal1.serviceinterfaces;

import pe.edu.upc.trabajo_grupal1.entities.Prenda;

import java.util.List;
import java.util.Optional;

public interface IPrendaService {
    public void insert(Prenda prenda);
    List<Prenda>list();
    public void delete(int idPrenda);
    public Optional<Prenda> listarId(int idPrenda);
    List<Prenda>search(String nombrePrenda);

    List<Prenda> buscarTienda(String nombreTienda);

    List<Prenda> buscarMarca(String nombreMarca);
    List<Prenda> buscarTalla(String letraTalla);
}
