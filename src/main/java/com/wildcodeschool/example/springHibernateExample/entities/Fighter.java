package com.wildcodeschool.example.springHibernateExample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fighter {

	
	public Fighter() {
    }

    public Fighter(String name, String attack, int combo) {
        this.name = name;
        this.attack = attack;
        this.combo = combo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     

    private String name;

    private String attack;

    private int combo;

    @Override
    public String toString() {
        return "User [id=" + id + ", Name=" + name + 
                ", attack=" + attack + ", combo=" + combo + "]";
    }            
    

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }    
}
