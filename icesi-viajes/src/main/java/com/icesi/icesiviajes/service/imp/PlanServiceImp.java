package com.icesi.icesiviajes.service.imp;


import com.icesi.icesiviajes.domain.Plan;
import com.icesi.icesiviajes.repository.PlanRepository;
import com.icesi.icesiviajes.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class PlanServiceImp implements PlanService {
    @Autowired
    private PlanRepository planRepository;
    @Override
    public List<Plan> findAll() {
        return planRepository.findAll();
    }

    @Override
    public Optional<Plan> findById(Long aLong) {
        return planRepository.findById(aLong);
    }

    @Override
    public Plan save(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public Plan update(Plan entity) throws Exception {
    if (planRepository.existsById(entity.getId())) {
            return planRepository.save(entity);
        } else {
            throw new Exception("El plan no existe");
        }    }

    @Override
    public void delete(Plan entity) throws Exception {
        planRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        if (planRepository.existsById(aLong)) {
            planRepository.deleteById(aLong);
        } else {
            throw new Exception("El plan no existe");
        }
    }

    @Override
    public void validate(Plan entity) throws Exception {

    }

    @Override
    public Long count() {
        return planRepository.count();
    }
}
