package com.dio.id_control.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.id_control.entities.WorkingDay;
import com.dio.id_control.repositories.WorkingDayRepository;


@Service
public class WorkingDayService {
	
	@Autowired
	private WorkingDayRepository workingRepository;

	public WorkingDay save(WorkingDay working) {
		return workingRepository.save(working);
	}

	public List<WorkingDay> findAll() {
		return workingRepository.findAll();
	}

	public Optional<WorkingDay> getById(Long id) {
	      return workingRepository.findById(id);
	}
	
	public WorkingDay update(WorkingDay working) {
		return workingRepository.save(working);
	}
	
	public void delete(Long id) {
	   workingRepository.deleteById(id);
	}
	
}
