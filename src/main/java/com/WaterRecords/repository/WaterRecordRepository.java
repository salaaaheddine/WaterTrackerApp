package com.WaterRecords.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WaterRecords.entity.User;
import com.WaterRecords.entity.WaterRecord;

@Repository
public interface WaterRecordRepository extends JpaRepository<WaterRecord, Long> {
    List<WaterRecord> findByUserOrderByDateDesc(User user);
}

