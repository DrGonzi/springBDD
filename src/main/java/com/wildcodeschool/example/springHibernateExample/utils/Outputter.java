package com.wildcodeschool.example.springHibernateExample.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.example.springHibernateExample.entities.Fighter;
import com.wildcodeschool.example.springHibernateExample.repositories.FighterRepository;



@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("Wilder");
	
	@Autowired
    private FighterRepository fighterRepository;

	@Override
	public void run(String... args) throws Exception {
		             
        LOG.info("******************");
        LOG.info("Objects in DB : " + fighterRepository.count());

        Fighter fighter1 = new Fighter("Camy", "Spiral Arrow", 3);
        LOG.info("******************");
        LOG.info(fighter1 + " has been created !");
        fighterRepository.save(fighter1);
        LOG.info(fighter1 + " has been saved !");


        Fighter fighter2 = new Fighter("Ryu", "Hadoken", 2);
        LOG.info("******************");
        LOG.info(fighter2 + " has been created !");
        fighterRepository.save(fighter2);
        LOG.info(fighter2 + " has been saved !");

        
        Fighter tempFighter = fighterRepository.findById(2L).get(); 
        
        LOG.info("******************");
        LOG.info("Second Fighter's Name is " + tempFighter.getName());
        LOG.info("Second user's Attack is " + tempFighter.getAttack());
        LOG.info("Second user's combo is " + tempFighter.getCombo());


        LOG.info("******************");
        LOG.info("Users in list are ");
        for(Fighter myFighter : fighterRepository.findAll()) {
            LOG.info(myFighter.toString());
        };
        
        
        fighterRepository.deleteById(2L); 


        LOG.info("******************");
        LOG.info("Fighter in list are ");
        for(Fighter myFighter : fighterRepository.findAll()) {
            LOG.info(myFighter.toString());
		
	}

	}
}
