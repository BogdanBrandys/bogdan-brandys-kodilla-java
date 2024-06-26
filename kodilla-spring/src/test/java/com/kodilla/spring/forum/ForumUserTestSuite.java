package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser userBean = context.getBean(ForumUser.class);

        //When
        String name = userBean.getUsername();

        //Then
        assertEquals("John Smith", name);
    }
}
