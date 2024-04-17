package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Rol;
import com.icesi.icesiviajes.repository.RolRepository;
import com.icesi.icesiviajes.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class RolServiceImp implements RolService {
    @Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long aLong) {
        return rolRepository.findById(aLong);
    }

    @Override
    public Rol save(Rol entity) throws Exception {
        return rolRepository.save(entity);
    }

    @Override
    public Rol update(Rol entity) throws Exception {
        if (rolRepository.existsById(entity.getId())) {
            return rolRepository.save(entity);
        } else {
            throw new Exception("El rol no existe");
        }    }

    @Override
    public void delete(Rol entity) throws Exception {
        rolRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (rolRepository.existsById(aLong)) {
            rolRepository.deleteById(aLong);
        } else {
            throw new Exception("El rol no existe");
        }
    }

    @Override
    public void validate(Rol entity) throws Exception {

    }

    @Override
    public Long count() {
        return  rolRepository.count();
    }
}
