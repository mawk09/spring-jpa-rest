package com.jeetatl.tryouts.spring.springjparest.domain;

import javax.persistence.*;

@Entity
@Table(name = "MSG_A")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("A")
public class AMessage extends Message {

    private String messageAColumn1;

    public String getMessageAColumn1() {
        return messageAColumn1;
    }

    public void setMessageAColumn1(String messageAColumn1) {
        this.messageAColumn1 = messageAColumn1;
    }
}
