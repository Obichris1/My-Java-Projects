/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import Enums.Transaction_Type;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Obinna
 */
@Entity
public class Process implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String date;
    String time;
    
    // Annotation to persist an enum
    @Enumerated(EnumType.STRING)
    private Transaction_Type tra ;    //Enum reference
    @ManyToOne                        // Mapping type process class to the account class using the Annotation
    Account account;                  // Account class refrence

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        
    }

    public String getTime() {
        return time;
    }

    public Transaction_Type getTra() {
        return tra;
    }

    public void setTra(Transaction_Type tra) {
        this.tra = tra;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.time);
        hash = 97 * hash + Objects.hashCode(this.tra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Process other = (Process) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.tra != other.tra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Process{" + "id=" + id + ", date=" + date + ", time=" + time + ", tra=" + tra + ", account=" + account + '}';
    }
    

    
    
}
