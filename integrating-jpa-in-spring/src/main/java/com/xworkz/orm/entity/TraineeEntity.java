package com.xworkz.orm.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "trainee_info")
@NamedQuery(name = "findAll",query = "select entities from TraineeEntity entities")
@NamedQuery(name = "findTraineeByName",query = "select entity from TraineeEntity entity where entity.traineeName=:var ")
@NamedQuery(name = "deleteTraineeByName",query = "delete from TraineeEntity ent where ent.traineeName=:var ")
public class TraineeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "trainee_name")
    private String traineeName;
    @Column(name = "trainee_cgpa")
    private Double cgpa;

}
