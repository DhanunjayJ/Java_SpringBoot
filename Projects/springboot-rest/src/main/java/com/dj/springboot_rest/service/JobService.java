package com.dj.springboot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.springboot_rest.model.JobPost;
import com.dj.springboot_rest.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}

    public JobPost getJob(int postId){
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId){
        repo.deleteJob(postId);
    }

}
