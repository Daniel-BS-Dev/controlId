package com.dio.id_control.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.id_control.entities.WorkingDay;
import com.dio.id_control.services.WorkingDayService;

import javassist.NotFoundException;

@RestController
@RequestMapping(value ="/working")
public class WorkingDayResource {
	
	@Autowired 
	private WorkingDayService workingService;
	
	@PostMapping
	public WorkingDay createWorking(@RequestBody WorkingDay working) {
		return workingService.save(working);
	}
	
	@GetMapping
	public List<WorkingDay> getWorking(){
		return workingService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<WorkingDay> getWorkingById(@PathVariable("id") Long id)throws Exception {
		return ResponseEntity.ok(workingService.getById(id).orElseThrow(() -> new NotFoundException("Not found")));
	}
	
	@PutMapping
	public WorkingDay update(@RequestBody WorkingDay working) {
		return workingService.update(working);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long id){
		try {
		workingService.delete(id);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	

}
