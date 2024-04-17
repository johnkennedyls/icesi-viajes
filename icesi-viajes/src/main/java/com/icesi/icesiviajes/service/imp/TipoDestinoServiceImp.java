package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.TipoDestino;
import com.icesi.icesiviajes.repository.TipoDestinoRepository;
import com.icesi.icesiviajes.service.TipoDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class TipoDestinoServiceImp implements TipoDestinoService {
    @Autowired
    private TipoDestinoRepository tipoDestinoRepository;
    @Override
    public List<TipoDestino> findAll() {
        return tipoDestinoRepository.findAll();
    }

    @Override
    public Optional<TipoDestino> findById(Long aLong) {
        return tipoDestinoRepository.findById(aLong);
    }

    @Override
    public TipoDestino save(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public TipoDestino update(TipoDestino entity) throws Exception {
    if (tipoDestinoRepository.existsById(entity.getId())) {
            return tipoDestinoRepository.save(entity);
        } else {
            throw new Exception("El tipo de destino no existe");
        }    }

    @Override
    public void delete(TipoDestino entity) throws Exception {
        tipoDestinoRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (tipoDestinoRepository.existsById(aLong)) {
            tipoDestinoRepository.deleteById(aLong);
        } else {
            throw new Exception("El tipo de destino no existe");
        }
    }

    @Override
    public void validate(TipoDestino entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoDestinoRepository.count();
    }
}
