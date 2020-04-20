package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
       // System.out.println("SpeakServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository){
        //System.out.println("SpeakServiceImpl repository constructor");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }




//
//    public List<Speaker> findAll(){
//        return repository.findAll();
//    }
//
//    public void setRepository(SpeakerRepository repository) {
//        System.out.println("SpeakServiceImpl setter");
//        this.repository = repository;
//    }
}
