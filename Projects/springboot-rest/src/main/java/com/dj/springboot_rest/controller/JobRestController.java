package com.dj.springboot_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dj.springboot_rest.model.JobPost;
import com.dj.springboot_rest.service.JobService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@Controller
@RestController
@CrossOrigin(origins="https://congenial-umbrella-wrwpwjj957g6fqx9-3000.app.github.dev/")
public class JobRestController {

    @Autowired
    private JobService service;
    // to make a method only return jason data not xml
    //we use produces to restrict
    @GetMapping(path = "jobPosts", produces = {"application/json"})
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    //to make it only consume xml
    @GetMapping(path="jobPost/{postId}", consumes = {"application/xml"})
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobpost) {
        service.addJobPost(jobpost);
        return service.getJob(jobpost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
    
    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }
}
