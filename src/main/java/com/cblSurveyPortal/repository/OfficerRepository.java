package com.cblSurveyPortal.repository;

import com.cblSurveyPortal.model.Officer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfficerRepository extends MongoRepository<Officer, String > {

    public Officer findByIdAndStatus(ObjectId id, String status);
    public Officer findByEmailAndStatus(String email,String status);
    public List<Officer> findAllByStatus(String status);
    public Officer findById(ObjectId id);
}
