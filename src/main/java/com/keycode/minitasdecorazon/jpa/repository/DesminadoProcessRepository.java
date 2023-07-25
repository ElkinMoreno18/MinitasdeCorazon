package com.keycode.minitasdecorazon.jpa.repository;

import com.keycode.minitasdecorazon.jpa.entity.DesminadoProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DesminadoProcessRepository extends JpaRepository<DesminadoProcess, Long> {

    List<DesminadoProcess> findByRegion(String region);

}
