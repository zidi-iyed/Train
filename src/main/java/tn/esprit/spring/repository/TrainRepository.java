package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;




@Repository
public interface TrainRepository extends CrudRepository<Train, Long> {
	

	


}
