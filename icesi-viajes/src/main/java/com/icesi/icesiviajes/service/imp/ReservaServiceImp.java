package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.Reserva;
import com.icesi.icesiviajes.repository.ReservaRepository;
import com.icesi.icesiviajes.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ReservaServiceImp implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    @Override
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reserva> findById(Long aLong) {
        return reservaRepository.findById(aLong);
    }

    @Override
    public Reserva save(Reserva entity) throws Exception {
        return reservaRepository.save(entity);
    }

    @Override
    public Reserva update(Reserva entity) throws Exception {
    if (reservaRepository.existsById(entity.getId())) {
            return reservaRepository.save(entity);
        } else {
            throw new Exception("La reserva no existe");
        }    }

    @Override
    public void delete(Reserva entity) throws Exception {
        reservaRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (reservaRepository.existsById(aLong)) {
            reservaRepository.deleteById(aLong);
        } else {
            throw new Exception("La reserva no existe");
        }
    }

    @Override
    public void validate(Reserva entity) throws Exception {

    }

    @Override
    public Long count() {
            return reservaRepository.count();
    }
}
