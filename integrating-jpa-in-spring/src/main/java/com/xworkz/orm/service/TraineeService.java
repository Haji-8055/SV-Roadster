package com.xworkz.orm.service;

import com.xworkz.orm.dto.TraineeDto;
import com.xworkz.orm.entity.TraineeEntity;

import java.util.List;

public interface TraineeService {

    String saveTrainee(TraineeDto traineeDto);

    List<TraineeDto> readTrainees();
    TraineeDto findTraineeByName(String traineeName);

    String updateTrainee(TraineeDto traineeDto);

    boolean deleteTrainee(String traineeName);
}
