package com.WaterRecords.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WaterRecords.entity.User;
import com.WaterRecords.entity.WaterRecord;
import com.WaterRecords.repository.UserRepository;
import com.WaterRecords.repository.WaterRecordRepository;

@Service
public class WaterRecordService {

    @Autowired
    private WaterRecordRepository waterRecordRepository;

    @Autowired
    private UserRepository userRepository;

    public List<WaterRecord> getUserWaterRecordHistory(String username) {
        User user = userRepository.findByUsername(username);
        return waterRecordRepository.findByUserOrderByDateDesc(user);
    }

    public void recordWaterRecord(String username, int quantity) {
        User user = userRepository.findByUsername(username);


        WaterRecord waterRecord = new WaterRecord();
        waterRecord.setUser(user);
        waterRecord.setAmount(quantity);
        waterRecord.setDate();

        waterRecordRepository.save(waterRecord);
    }
} 