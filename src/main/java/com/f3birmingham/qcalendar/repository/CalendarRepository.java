package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Calendar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource
public interface CalendarRepository extends CrudRepository<Calendar,Integer> {

    List<Calendar> findByAoId(Integer aoId);

    List<Calendar> findByWorkoutDateBetween(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate);

    List<Calendar> findByAoIdAndWorkoutDateBetween(Integer aoId, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate);
}
