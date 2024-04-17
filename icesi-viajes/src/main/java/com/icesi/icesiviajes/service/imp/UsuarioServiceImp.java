package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Usuario;
import com.icesi.icesiviajes.repository.UsuarioRepository;
import com.icesi.icesiviajes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long aLong) {
        return usuarioRepository.findById(aLong);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
    if (usuarioRepository.existsById(entity.getId())) {
            return usuarioRepository.save(entity);
        } else {
            throw new Exception("El usuario no existe");
        }    }

    @Override
    public void delete(Usuario entity) throws Exception {
        usuarioRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (usuarioRepository.existsById(aLong)) {
            usuarioRepository.deleteById(aLong);
        } else {
            throw new Exception("El usuario no existe");
        }
    }

    @Override
    public void validate(Usuario entity) throws Exception {

    }

    @Override
    public Long count() {
        return usuarioRepository.count();
    }
}
