package com.icesi.icesiviajes.service.imp;

import com.icesi.icesiviajes.domain.DetallePlan;
import com.icesi.icesiviajes.repository.DetallePlanRepository;
import com.icesi.icesiviajes.service.DetallePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Scope("singleton")
@Service
public class DetallePlanServiceImp implements DetallePlanService {

    @Autowired
    private DetallePlanRepository detallePlanRepository;
    @Override
    public List<DetallePlan> findAll() {
        return detallePlanRepository.findAll();
    }

    @Override
    public Optional<DetallePlan> findById(Long aLong) {
        return detallePlanRepository.findById(aLong);
    }

    @Override
    public DetallePlan save(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public DetallePlan update(DetallePlan entity) throws Exception {
        if (detallePlanRepository.existsById(entity.getId())) {
            return detallePlanRepository.save(entity);
        } else {
            throw new Exception("El detalle del plan no existe");
        }    }

    @Override
    public void delete(DetallePlan entity) throws Exception {

    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (detallePlanRepository.existsById(aLong)) {
            detallePlanRepository.deleteById(aLong);
        } else {
            throw new Exception("El detalle del plan no existe");
        }
    }

    @Override
    public void validate(DetallePlan entity) throws Exception {

    }

    @Override
    public Long count() {
        return detallePlanRepository.count();
    }
}
