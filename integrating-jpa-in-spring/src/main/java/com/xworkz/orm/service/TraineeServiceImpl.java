package com.xworkz.orm.service;

import com.xworkz.orm.dto.TraineeDto;
import com.xworkz.orm.entity.TraineeEntity;
import com.xworkz.orm.repository.TraineeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@Component
@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    TraineeRepository traineeRepository;

    @Override
    public String saveTrainee(TraineeDto traineeDto) {

        System.out.println("running saveTrainee  TraineeServiceImpl  : dto is : " + traineeDto);
        TraineeEntity traineeEntityFromDataBase = traineeRepository.findTraineeByName(traineeDto.getTraineeName());

        if (traineeEntityFromDataBase != null) {
            return "trainee already exist";
        }
        TraineeEntity traineeEntity = new TraineeEntity();
        BeanUtils.copyProperties(traineeDto, traineeEntity);
        traineeRepository.saveTrainee(traineeEntity);
        return "data saved successfully";
    }

    @Override
    public List<TraineeDto> readTrainees() {
        List<TraineeEntity> listOfEntities = traineeRepository.readTrainees();
        List<TraineeDto> listOfDtos = new ArrayList<>();

        if (!listOfEntities.isEmpty()) {
            for (TraineeEntity traineeEntity : listOfEntities) {
                TraineeDto traineeDto = new TraineeDto();
                traineeDto.setId(traineeEntity.getId());
                traineeDto.setTraineeName(traineeEntity.getTraineeName());
                traineeDto.setCgpa(traineeEntity.getCgpa());
                listOfDtos.add(traineeDto);
            }
        }
        return listOfDtos;
    }

    @Override
    public TraineeDto findTraineeByName(String traineeName) {
        if (traineeName != null) {

            TraineeDto traineeDto = new TraineeDto();

            TraineeEntity traineeEntity = traineeRepository.findTraineeByName(traineeName);
            if (traineeEntity != null) {
                BeanUtils.copyProperties(traineeEntity, traineeDto);
                return traineeDto;
            }
        }
        return null;
    }

    @Override
    public String updateTrainee(TraineeDto traineeDto) {

        TraineeEntity traineeEntity = new TraineeEntity();
        BeanUtils.copyProperties(traineeDto, traineeEntity);
        traineeRepository.updateTrainee(traineeEntity);
        return "data updated";


    }

    @Override
    public boolean deleteTrainee(String traineeName) {
        boolean isDeleted = traineeRepository.deleteTrainee(traineeName);
        return isDeleted;
    }
}
