package com.jeetatl.tryouts.spring.springjparest.domain;

import javax.persistence.*;

@Entity
@Table(name = "MSG_B")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("B")
public class BMessage extends Message {

    private String messageBColumn1;

    public String getMessageBColumn1() {
        return messageBColumn1;
    }

    public void setMessageBColumn1(String messageBColumn1) {
        this.messageBColumn1 = messageBColumn1;
    }
}
