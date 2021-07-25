package com.dio.id_control.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.id_control.entities.WorkingDay;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay,Long>  {

}
