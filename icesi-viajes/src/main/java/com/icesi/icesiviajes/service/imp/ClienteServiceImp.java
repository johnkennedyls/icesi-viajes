package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Cliente;
import com.icesi.icesiviajes.repository.ClienteRepository;
import com.icesi.icesiviajes.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ClienteServiceImp implements ClienteService {
    private static final Logger logger = LoggerFactory.getLogger(ClienteServiceImp.class);

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> findAll() {
        logger.info("Finding all Clientes");
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long aLong) {
        logger.info("Finding Cliente by id");
        return clienteRepository.findById(aLong);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        logger.info("Saving Cliente");
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        if (clienteRepository.existsById(entity.getId())) {
            logger.info("Updating Cliente");
            return clienteRepository.save(entity);
        } else {
            logger.error("Cliente does not exist");
            throw new Exception("El Cliente no existe");
        }    }

    @Override
    public void delete(Cliente entity) throws Exception {
        logger.info("Deleting Cliente");
        clienteRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (clienteRepository.existsById(aLong)) {
            logger.info("Deleting Cliente by id");
            clienteRepository.deleteById(aLong);
        } else {
            logger.error("Cliente does not exist");
            throw new Exception("El Cliente no existe");
        }    }

    @Override
    public void validate(Cliente entity) throws Exception {
        logger.info("Validating Cliente");
    }

    @Override
    public Long count() {
        logger.info("Counting Clientes");
        return clienteRepository.count();
    }
}
