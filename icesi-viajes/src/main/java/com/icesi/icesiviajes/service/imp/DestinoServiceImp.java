package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Destino;
import com.icesi.icesiviajes.repository.DestinoRepository;
import com.icesi.icesiviajes.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Scope("singleton")
@Service
public class DestinoServiceImp implements DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;
    @Override
    public List<Destino> findAll() {
        return destinoRepository.findAll();
    }

    @Override
    public Optional<Destino> findById(Long aLong) {
        return destinoRepository.findById(aLong);
    }

    @Override
    public Destino save(Destino entity) throws Exception {
        return destinoRepository.save(entity);
    }

    @Override
    public Destino update(Destino entity) throws Exception {
        if (destinoRepository.existsById(entity.getId())) {
            return destinoRepository.save(entity);
        } else {
            throw new Exception("El destino no existe");
        }    }

    @Override
    public void delete(Destino entity) throws Exception {
        destinoRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (destinoRepository.existsById(aLong)) {
            destinoRepository.deleteById(aLong);
        } else {
            throw new Exception("El destino no existe");
        }    }

    @Override
    public void validate(Destino entity) throws Exception {

    }

    @Override
    public Long count() {
        return destinoRepository.count();
    }
}
