package com.prettyye.service;

import com.prettyye.model.Speaker;
import com.prettyye.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl repository constructor");
        this.repository = repository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

//    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }
}
