package com.jeetatl.tryouts.spring.springjparest.domain;

import javax.persistence.*;

@Entity
@Table(name = "MSG")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
public class Message {

    @Id @GeneratedValue
    private Long id;
    private String messageColumn1;
    @Column(name = "TYPE", updatable = false, insertable = false)
    private String messageType;

    public String getMessageColumn1() {
        return messageColumn1;
    }

    public void setMessageColumn1(String messageColumn1) {
        this.messageColumn1 = messageColumn1;
    }

    public String getMessageType() {
        return messageType;
    }
}
