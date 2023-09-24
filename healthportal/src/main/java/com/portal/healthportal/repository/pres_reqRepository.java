package com.portal.healthportal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portal.healthportal.entity.Pres_req;
@Repository
public interface pres_reqRepository extends JpaRepository<Pres_req,Integer> {
	

}
