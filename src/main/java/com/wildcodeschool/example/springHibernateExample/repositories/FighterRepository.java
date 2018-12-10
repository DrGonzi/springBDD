package com.wildcodeschool.example.springHibernateExample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.example.springHibernateExample.entities.Fighter;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {

}
