package com.xworkz.orm.repository;

import com.xworkz.orm.dto.TraineeDto;
import com.xworkz.orm.entity.TraineeEntity;

import java.util.List;

public interface TraineeRepository {

    boolean saveTrainee(TraineeEntity traineeEntity);

    List<TraineeEntity> readTrainees();

    TraineeEntity findTraineeByName(String traineeName);

    String updateTrainee(TraineeEntity traineeEntity);

    boolean deleteTrainee(String traineeName);


}
