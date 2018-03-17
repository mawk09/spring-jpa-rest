package com.jeetatl.tryouts.spring.springjparest.config;

import com.jeetatl.tryouts.spring.springjparest.domain.AMessage;
import com.jeetatl.tryouts.spring.springjparest.domain.BMessage;
import com.jeetatl.tryouts.spring.springjparest.domain.Message;
import com.jeetatl.tryouts.spring.springjparest.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataSetup {

    private MessageRepository messageRepository;

    @PostConstruct
    public void setupData() {
        AMessage aMessage = new AMessage();
        aMessage.setMessageColumn1("MColumn1");
        aMessage.setMessageAColumn1("AColumn1");
        messageRepository.save((Message) aMessage);

        BMessage bMessage = new BMessage();
        bMessage.setMessageColumn1("MColumn1");
        bMessage.setMessageBColumn1("BColumn1");
        messageRepository.save((Message) bMessage);
    }

    @Autowired
    public void setMessageRepository(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
