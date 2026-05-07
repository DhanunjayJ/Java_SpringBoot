package com.dj.springboot_rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.springboot_rest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>{
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDecription);
}
