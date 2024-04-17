package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.TipoServicio;
import com.icesi.icesiviajes.repository.TipoServicioRepository;
import com.icesi.icesiviajes.service.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Scope("singleton")
@Service
public class TipoServicioServiceImp implements TipoServicioService {
    @Autowired
    private TipoServicioRepository tipoServicioRepository;
    @Override
    public List<TipoServicio> findAll() {
        return tipoServicioRepository.findAll();
    }

    @Override
    public Optional<TipoServicio> findById(Long aLong) {
        return tipoServicioRepository.findById(aLong);
    }

    @Override
    public TipoServicio save(TipoServicio entity) throws Exception {
        return tipoServicioRepository.save(entity);
    }

    @Override
    public TipoServicio update(TipoServicio entity) throws Exception {
    if (tipoServicioRepository.existsById(entity.getId())) {
            return tipoServicioRepository.save(entity);
        } else {
            throw new Exception("El tipo de servicio no existe");
        }    }

    @Override
    public void delete(TipoServicio entity) throws Exception {
        tipoServicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (tipoServicioRepository.existsById(aLong)) {
            tipoServicioRepository.deleteById(aLong);
        } else {
            throw new Exception("El tipo de servicio no existe");
        }
    }

    @Override
    public void validate(TipoServicio entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoServicioRepository.count();
    }
}
