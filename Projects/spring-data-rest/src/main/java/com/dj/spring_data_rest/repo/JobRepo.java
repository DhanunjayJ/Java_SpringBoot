package com.dj.spring_data_rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.spring_data_rest.Model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>{
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDecription);
}