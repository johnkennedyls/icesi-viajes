package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.TipoIdentificacion;
import com.icesi.icesiviajes.repository.TipoIdentificacionRepository;
import com.icesi.icesiviajes.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class TipoIdentificacionServiceImp implements TipoIdentificacionService {
    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;
    @Override
    public List<TipoIdentificacion> findAll() {
        return tipoIdentificacionRepository.findAll();
    }

    @Override
    public Optional<TipoIdentificacion> findById(Long aLong) {
        return tipoIdentificacionRepository.findById(aLong);
    }

    @Override
    public TipoIdentificacion save(TipoIdentificacion entity) throws Exception {
        return tipoIdentificacionRepository.save(entity);
    }

    @Override
    public TipoIdentificacion update(TipoIdentificacion entity) throws Exception {
        if (tipoIdentificacionRepository.existsById(entity.getId())) {
            return tipoIdentificacionRepository.save(entity);
        } else {
            throw new Exception("El tipo de identificacion no existe");
        }    }

    @Override
    public void delete(TipoIdentificacion entity) throws Exception {
        tipoIdentificacionRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (tipoIdentificacionRepository.existsById(aLong)) {
            tipoIdentificacionRepository.deleteById(aLong);
        } else {
            throw new Exception("El tipo de identificacion no existe");
        }
    }

    @Override
    public void validate(TipoIdentificacion entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoIdentificacionRepository.count();
    }
}
