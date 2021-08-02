package com.example.jpabook2.dummies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class HibernateH2Test {

    @Autowired
    DummyRepository repository;

    @Test
    public void h2Test(){
        //given
        DummyTable dummyTable = new DummyTable();
        String name = "name";
        int age = 14;
        dummyTable.setDummyName(name);
        dummyTable.setDummyAge(age);

        //when
        repository.save(dummyTable);

        //then
        DummyTable findDum = repository.findOne(dummyTable.getId());

        assertThat(findDum).isEqualTo(dummyTable);
    }
}
