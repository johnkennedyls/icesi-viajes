package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Servicio;
import com.icesi.icesiviajes.repository.ServicioRepository;
import com.icesi.icesiviajes.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ServicioServiceImp implements ServicioService {
    @Autowired
    private ServicioRepository servicioRepository;
    @Override
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    @Override
    public Optional<Servicio> findById(Long aLong) {
        return servicioRepository.findById(aLong);
    }

    @Override
    public Servicio save(Servicio entity) throws Exception {
        return servicioRepository.save(entity);
    }

    @Override
    public Servicio update(Servicio entity) throws Exception {
    if (servicioRepository.existsById(entity.getId())) {
            return servicioRepository.save(entity);
        } else {
            throw new Exception("El servicio no existe");
        }    }

    @Override
    public void delete(Servicio entity) throws Exception {
        servicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (servicioRepository.existsById(aLong)) {
            servicioRepository.deleteById(aLong);
        } else {
            throw new Exception("El servicio no existe");
        }
    }

    @Override
    public void validate(Servicio entity) throws Exception {

    }

    @Override
    public Long count() {
        return servicioRepository.count();
    }
}
