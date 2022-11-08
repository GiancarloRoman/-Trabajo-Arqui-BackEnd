package pe.edu.upc.trabajo_grupal1.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_grupal1.entities.Marca;
import pe.edu.upc.trabajo_grupal1.entities.Prenda;
import pe.edu.upc.trabajo_grupal1.repositories.IPrendaRepository;
import pe.edu.upc.trabajo_grupal1.serviceinterfaces.IPrendaService;

import java.util.List;
import java.util.Optional;

@Service
public class PrendaServiceImpl implements IPrendaService {

    @Autowired
    private IPrendaRepository pR;
    @Override
    public void insert(Prenda prenda) {
        pR.save(prenda);
    }

    @Override
    public List<Prenda> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPrenda) {
        pR.deleteById(idPrenda);
    }

    @Override
    public Optional<Prenda> listarId(int idPrenda) {
        return Optional.of(pR.findById(idPrenda).orElse(new Prenda()));
    }

    @Override
    public List<Prenda> search(String nombrePrenda) {
        return pR.searchPrenda(nombrePrenda);
    }

    @Override
    public List<Prenda> buscarTienda(String nombreTienda) {
        return pR.searchTienda(nombreTienda);
    }

    @Override
    public List<Prenda> buscarMarca(String nombreMarca) {
        return pR.searchMarca(nombreMarca);
    }

    @Override
    public List<Prenda> buscarTalla(String letraTalla) {
        return pR.searchTalla(letraTalla);
    }
}
