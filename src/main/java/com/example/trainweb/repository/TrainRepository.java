package com.example.trainweb.repository;

import com.example.trainweb.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}
